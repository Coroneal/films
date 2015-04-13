package pl.edu.agh.integracja.films.utils;

import java.beans.PropertyVetoException;
import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.jooq.DSLContext;
import org.jooq.InsertSetStep;
import org.jooq.InsertValuesStepN;
import org.jooq.Record;
import org.jooq.SQLDialect;
import org.jooq.Table;
import org.jooq.impl.DSL;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public abstract class MySqlService implements Closeable {

	protected final ComboPooledDataSource cpds;

	public MySqlService(String url, String user, String password) {
		try {
			cpds = new ComboPooledDataSource();
			cpds.setDriverClass("com.mysql.jdbc.Driver");
			cpds.setJdbcUrl(url);
			cpds.setUser(user);
			cpds.setPassword(password);
		} catch (PropertyVetoException e) {
			throw new IllegalStateException(e);
		}
	}

	protected DSLContext getContext(Connection connection) {
		return DSL.using(connection, SQLDialect.MYSQL);
	}

	protected <T> T put(Class<T> resultClass, Object[] record, Table table) throws SQLException {
		try (Connection connection = cpds.getConnection()) {
			return getContext(connection)
					.insertInto(table)
					.values(record)
					.returning()
					.fetchOne()
					.into(resultClass);
		}
	}

	protected <R extends Record, T> List<T> putAll(Class<T> resultClass, Collection<Object[]> records, Table<R> table)
			throws SQLException {
		try (Connection connection = cpds.getConnection()) {
			InsertSetStep<R> insert = getContext(connection).insertInto(table);
			InsertValuesStepN<R> insertStepN = null;
			for (Object[] record : records) {
				insertStepN = insert.values(record);
			}
			if (insertStepN != null) {
				return insertStepN
						.returning()
						.fetch()
						.into(resultClass);
			} else {
				return new ArrayList<>();
			}
		}
	}

	@Override
	public void close() throws IOException {
		cpds.close();
	}

}

