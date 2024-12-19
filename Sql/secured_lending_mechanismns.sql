create table if not exists secured_lending_mechanismns(
secure_code bigint not null,
peer_to_peer varchar(255) null,
micro_finance varchar(255) null,
macro_finance varchar(255) null,
government_approved_lendings varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint secured_lending_mechanismns_pk primary key(secure_code));