
-- NODE QUERY

SELECT DISTINCT
		Actor.id                               AS id,
		concat(Actor.name, ' ', Actor.surname) AS label
    FROM
    (
		SELECT Actor_Movie.actor_id
		FROM Movie
		JOIN Actor_Movie ON Actor_Movie.movie_id = Movie.id
		WHERE Movie.vote_count > 1500 AND Actor_Movie.rank < 10
    ) AS actor_mov
    JOIN Actor ON Actor.id = actor_mov.actor_id;


-- EDGE QUERY

SELECT
		a.actor_id AS source,
		b.actor_id AS target,
		Movie.title AS label,
		count(*) AS weight
	FROM Actor_Movie AS a
	JOIN Actor_Movie AS b ON a.movie_id = b.movie_id AND a.actor_id != b.actor_id
	JOIN Movie ON a.movie_id = Movie.id
	WHERE Movie.vote_count > 1500 AND a.rank < 10 AND b.rank < 10
	GROUP BY a.actor_id, b.actor_id;
