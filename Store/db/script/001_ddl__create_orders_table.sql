create table if not exists orders
(
    id serial   primary key,
    description varchar(255),
    price       integer not null
);
