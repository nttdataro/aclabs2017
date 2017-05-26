-- create schema
DROP SCHEMA IF EXISTS attendance CASCADE;
CREATE SCHEMA IF NOT EXISTS attendance;
set search_path to attendance;

-- create attendance sequence
CREATE SEQUENCE sq_attendance_object_id START 100;

-- create attendance table
CREATE TABLE attendanceTable(
   attendance_id	  BIGINT PRIMARY KEY DEFAULT NEXTVAL('sq_attendance_object_id'),
   firstName VARCHAR(100) NOT NULL,
   lastName	  VARCHAR(100) NOT NULL,
   created_timestamp  TIMESTAMP NOT NULL,
   dojo VARCHAR(100) NOT NULL,
   laboratory VARCHAR(100) NOT NULL
);
