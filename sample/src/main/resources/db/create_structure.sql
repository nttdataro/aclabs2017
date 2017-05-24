-- create schema

DROP SCHEMA IF EXISTS sample CASCADE;

CREATE SCHEMA IF NOT EXISTS sample;

set search_path to sample;



-- create sequence


CREATE SEQUENCE sq_user_id START 100;


CREATE SEQUENCE sq_num_id START 1;



-- create table

CREATE TABLE user_table(
   
   user_id	      BIGINT  PRIMARY KEY DEFAULT NEXTVAL('sq_user_id'),

   firstname	 VARCHAR(100) NOT NULL,

   lastname      VARCHAR(100) NOT NULL
);
CREATE TABLE user_roles(
   
   user_id	 BIGINT  REFERENCES user_table(user_id),

   user_role          VARCHAR(100) NOT NULL
);

CREATE TABLE user_attendance(
   
   num_id         BIGINT PRIMARY KEY DEFAULT NEXTVAL('sq_num_id'),

   user_id	      BIGINT  REFERENCES user_table(user_id),

   created_timestamp  TIMESTAMP NOT NULL,
   
   workshop       BIGINT NOT NULL 
);

-- insert sample data
insert into user_table (firstname, lastname) values

('firstname1', 'lastname1'),

('firstname2', 'lastname2'),

('firstname3', 'lastname3'),

('firstname4', 'lastname4');


INSERT into user_attendance (user_id, created_timestamp, workshop) values

(101, current_timestamp, 1),

(102, current_timestamp, 2),

(103, current_timestamp, 1),

(100, current_timestamp, 1);


INSERT into user_roles (user_id, user_role) 
values

(101, 'mentor'),

(102, 'ninja'),

(103, 'mentor'),

(100, 'ninja');


