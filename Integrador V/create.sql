drop table if exists patient;
drop table if exists address;
create table if not exists address(
  id int auto_increment  not null ,
  street varchar(255) not null,
  number varchar(255) not null,
  city varchar(255) not null,
  district varchar(255) not null,
  constraint id primary key (id)
);
create table if not exists patient(
  id int auto_increment primary key not null,
  name varchar(255) not null,
  lastName varchar(255) not null,
  rg varchar(20) not null,
  registrationDate timestamp default current_timestamp,
  idAddress int not null,
  foreign key (idAddress) references address(id)
);
