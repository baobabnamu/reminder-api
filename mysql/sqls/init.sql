DROP DATABASE IF EXISTS reminder;

CREATE DATABASE reminder;

USE reminder;

CREATE TABLE USER (
                      userid VARCHAR(15),
                      nickname VARCHAR(10),
                      password VARCHAR(15),
                      PRIMARY KEY(userid)
);

CREATE TABLE QUIZ (
                      id INT(255) AUTO_INCREMENT,
                      word VARCHAR(50),
                      mean VARCHAR(50),
                      quizSpace INT(1),
                      PRIMARY KEY(id)
);