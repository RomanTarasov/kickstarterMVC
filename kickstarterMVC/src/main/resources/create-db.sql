drop table quotes if exists
drop table categories if exists
drop table projects if exists
CREATE TABLE quotes (id BIGINT PRIMARY KEY, text varchar(255), author varchar(255))
CREATE TABLE categories (id BIGINT PRIMARY KEY, name varchar(255))
CREATE TABLE projects (id BIGINT PRIMARY KEY, name varchar(255),category_id BIGINT, theEndDay integer,invest_options varchar(255) ARRAY, link varchar(255), description varchar(255), short_description varchar(255), history varchar(255),pledged double ,goal double,amountsForInvest double ARRAY )
 