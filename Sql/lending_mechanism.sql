create table if not exists lending_mechanism(
lending_code bigint not null,
secured bigint null,
unsecured varchar(255) null,
short_term_lending varchar(255) null,
long_term_lending varchar(255) null,
commercial varchar(255) null,
consumer varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint lending_mechanism_pk primary key(lending_code));