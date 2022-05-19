DROP DATABASE IF EXISTS reminder;

CREATE DATABASE reminder;

USE reminder;

CREATE TABLE QUIZ (
                      word VARCHAR(50) NOT NULL,
                      mean VARCHAR(50) NOT NULL,
                      quizSpace INT(1) NOT NULL,
                      PRIMARY KEY(word)
);