-- create schema
DROP SCHEMA IF EXISTS attendance CASCADE;
CREATE SCHEMA IF NOT EXISTS attendance;
set search_path to attendance;

-- create attendance sequence
CREATE SEQUENCE sqAttendanceObjectID START 100;

-- create attendance table
CREATE TABLE attendanceTable(
   attendanceID	  BIGINT PRIMARY KEY DEFAULT NEXTVAL('sqAttendanceObjectID'),
   firstName VARCHAR(100) NOT NULL,
   lastName	  VARCHAR(100) NOT NULL,
   createdTimestamp  TIMESTAMP NOT NULL,
   dojo VARCHAR(100) NOT NULL,
   laboratory VARCHAR(100) NOT NULL
);
