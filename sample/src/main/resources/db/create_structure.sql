-- create schema

DROP SCHEMA IF EXISTS dojo CASCADE;

CREATE SCHEMA IF NOT EXISTS dojo;


set search_path to dojo;



-- create sequence


CREATE SEQUENCE sq_user_id START 100;


CREATE SEQUENCE sq_num_id START 1;


-- create table

CREATE TABLE user_table(
   
   user_id	      BIGINT  PRIMARY KEY DEFAULT NEXTVAL('sq_user_id'),

   firstname	 VARCHAR(100) NOT NULL,

   lastname      VARCHAR(100) NOT NULL,
   
   created_timestamp  TIMESTAMP NOT NULL
);

CREATE TABLE user_attendance(
   
   num_id         BIGINT PRIMARY KEY DEFAULT NEXTVAL('sq_num_id'),

   user_id	      BIGINT  REFERENCES user_table(user_id) NOT NULL,  

   created_timestamp  TIMESTAMP NOT NULL,
   
   workshop       BIGINT NOT NULL 
);

-- insert sample data
insert into user_table (firstname, lastname, created_timestamp) values

('firstname1', 'lastname1', current_timestamp),

('firstname2', 'lastname2', current_timestamp),

('firstname3', 'lastname3', current_timestamp),

('firstname4', 'lastname4', current_timestamp);


INSERT into user_attendance (user_id, created_timestamp, workshop) values

(101, current_timestamp, 3),

(102, current_timestamp, 2),

(103, current_timestamp, 1),

(100, current_timestamp, 1);






