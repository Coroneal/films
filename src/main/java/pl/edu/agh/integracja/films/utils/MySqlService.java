package pl.edu.agh.integracja.films.utils;

import java.beans.PropertyVetoException;
import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
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

	@Override
	public void close() throws IOException {
		cpds.close();
	}

}

