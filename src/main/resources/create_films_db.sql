-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2015-04-12 16:21:08.737

CREATE DATABASE films;
create user 'films'@'localhost' identified by 'films';
grant all on films.* to 'films'@'%';

USE films;


-- tables
-- Table Actor
CREATE TABLE Actor (
    id int    NOT NULL AUTO_INCREMENT,
    name varchar(100)    NOT NULL ,
    surname varchar(100)    NOT NULL ,
    sex varchar(1)    NOT NULL ,
    jmdbid bigint    NOT NULL ,
    CONSTRAINT Actor_pk PRIMARY KEY (id)
);

-- Table Director
CREATE TABLE Director (
    id int    NOT NULL AUTO_INCREMENT,
    name varchar(100)    NOT NULL ,
    surname varchar(100)    NOT NULL ,
    jmdbid bigint    NOT NULL ,
    CONSTRAINT Director_pk PRIMARY KEY (id)
);

-- Table Genre
CREATE TABLE Genre (
    id int    NOT NULL AUTO_INCREMENT,
    name varchar(250)    NOT NULL ,
    CONSTRAINT Genre_pk PRIMARY KEY (id)
);

-- Table Movie
CREATE TABLE Movie (
    id int    NOT NULL AUTO_INCREMENT,
    title varchar(500)    NOT NULL ,
    language varchar(100)    NOT NULL ,
    release_date date    NOT NULL ,
    budget bigint    NOT NULL ,
    revenue bigint    NOT NULL ,
    popularity double    NOT NULL ,
    vote_count int    NOT NULL ,
    vote_average double    NOT NULL ,
    imdb_rating double ,
    imdb_votes int ,
    tomato_rating double ,
    tomato_user_rating double ,
    jmdbid bigint    NOT NULL ,
    CONSTRAINT Movie_pk PRIMARY KEY (id)
);

-- Table Actor_Movie
CREATE TABLE Actor_Movie (
    id int    NOT NULL AUTO_INCREMENT,
    movie_id int    NOT NULL ,
    actor_id int    NOT NULL ,
    role varchar(1000)    NOT NULL ,
    rank int ,
    CONSTRAINT Actor_Movie_pk PRIMARY KEY (id),
    CONSTRAINT Actor_Movie_Movie_fk FOREIGN KEY (movie_id) REFERENCES Movie (id),
    CONSTRAINT Actor_Movie_Actor_fk FOREIGN KEY (actor_id) REFERENCES Actor (id)
);

-- Table Director_Movie
CREATE TABLE Director_Movie (
    id int    NOT NULL AUTO_INCREMENT,
    movie_id int    NOT NULL ,
    director_id int    NOT NULL ,
    CONSTRAINT Director_Movie_pk PRIMARY KEY (id),
    CONSTRAINT Director_Movie_Movie_fk FOREIGN KEY (movie_id) REFERENCES Movie (id),
    CONSTRAINT Director_Movie_Director_fk FOREIGN KEY (director_id) REFERENCES Director (id)
);

-- Table Genre_Movie
CREATE TABLE Genre_Movie (
    id int    NOT NULL AUTO_INCREMENT,
    movie_id int    NOT NULL ,
    genre_id int    NOT NULL ,
    CONSTRAINT Genre_Movie_pk PRIMARY KEY (id),
    CONSTRAINT Genre_Movie_Movie_fk FOREIGN KEY (movie_id) REFERENCES Movie (id),
    CONSTRAINT Genre_Movie_Genre_fk FOREIGN KEY (genre_id) REFERENCES Genre (id)
);

-- End of file.

