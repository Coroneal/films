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

-- Table Actor_Movie
CREATE TABLE Actor_Movie (
    id int    NOT NULL AUTO_INCREMENT,
    movie_id int    NOT NULL ,
    actor_id int    NOT NULL ,
    role varchar(1000)    NOT NULL ,
    main_role bool ,
    CONSTRAINT Actor_Movie_pk PRIMARY KEY (id)
);

-- Table Director
CREATE TABLE Director (
    id int    NOT NULL AUTO_INCREMENT,
    name varchar(100)    NOT NULL ,
    surname varchar(100)    NOT NULL ,
    jmdbid bigint    NOT NULL ,
    CONSTRAINT Director_pk PRIMARY KEY (id)
);

-- Table Director_Movie
CREATE TABLE Director_Movie (
    id int    NOT NULL AUTO_INCREMENT,
    movie_id int    NOT NULL ,
    director_id int    NOT NULL ,
    CONSTRAINT Director_Movie_pk PRIMARY KEY (id)
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
    genre_id int    NOT NULL ,
    jmdbid bigint    NOT NULL ,
    CONSTRAINT Movie_pk PRIMARY KEY (id)
);

-- End of file.
