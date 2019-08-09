CREATE KEYSPACE demo  WITH replication = {'class': 'SimpleStrategy', 'replication_factor' : 1};


CREATE TABLE users (
    user text PRIMARY KEY,
    password text,
    role text
) WITH comment='Important biological records';

insert into users ( user, password, role ) values ( 'ilker' , '123456', 'ADMIN' );