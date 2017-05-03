-- create schema
DROP SCHEMA IF EXISTS sample CASCADE;
CREATE SCHEMA IF NOT EXISTS sample;
set search_path to sample;

-- create sample sequence
CREATE SEQUENCE sq_sample_object_id START 100;

-- create sample table
CREATE TABLE t_sample(
   sample_object_id	  BIGINT PRIMARY KEY DEFAULT NEXTVAL('sq_sample_object_id'),
   name	              VARCHAR(100) NOT NULL,
   internal_name	  VARCHAR(100) NOT NULL,
   created_timestamp  TIMESTAMP NOT NULL,
   updated_timestamp  TIMESTAMP NOT NULL
);

-- insert sample data
insert into t_sample (name, internal_name, created_timestamp, updated_timestamp) values
('sample1', 'sample1InternalName', current_timestamp, current_timestamp),
('sample2', 'sample2InternalName', current_timestamp, current_timestamp),
('sample3', 'sample3InternalName', current_timestamp, current_timestamp),
('sample4', 'sample4InternalName', current_timestamp, current_timestamp);