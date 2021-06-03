USE adlister_ab;

CREATE table if not exists USERS (
    id int unsigned auto-increment,
    username varchar (100) not null,
    email varchar(100) not null,
    password varchar (50) not null,
    primary key (id)
);