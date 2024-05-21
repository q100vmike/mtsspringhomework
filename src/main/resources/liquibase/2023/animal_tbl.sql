CREATE SCHEMA if not exists animals;
create table if not exists animals.animal_type
(
    id bigint not null primary key,
    type varchar (100),
    extra_info varchar (100)
);
alter table animals.animal_type owner to mkustov;
create table if not exists animals.animal
(
    id bigint not null primary key,
    name varchar (100),
    breed varchar (100),
    cost numeric(38,2),
    character varchar (100),
    secret_info varchar (100),
	type_id int,
       CONSTRAINT fk_animal_type
          FOREIGN KEY(type_id)
            REFERENCES animals.animal_type(id)
);
alter table animals.animal owner to mkustov;