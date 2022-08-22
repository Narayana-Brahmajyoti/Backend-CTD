drop table if exists patient;
drop table if exists address;
create table if not exists address(
  id int auto_increment primary key,
  street varchar(255),
  number varchar(255),
  city varchar(255),
  district varchar(255)
);
create table if not exists patient(
  id int auto_increment primary key,
  name varchar(255),
  lastName varchar(255),
  rg varchar(20),
  registrationDate timestamp default current_timestamp,
  idAddress int not null,
  foreign key (idAddress) references address(id)
);
