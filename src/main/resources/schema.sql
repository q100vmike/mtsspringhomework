create table if not exists mkustov.animal
(
    id bigint not null primary key,
    name varchar (100),
    breed varchar (100),
    cost numeric(38,2),
    character varchar (100),
    secretInfo varchar (100)
);
alter table mkustov.animal owner to mkustov;