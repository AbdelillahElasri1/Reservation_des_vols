
create table Clients (
    code varchar(255) primary key ,
    first_name varchar(255) not null ,
    last_name varchar(255) not null ,
    email varchar(255) not null ,
    phone varchar(255) not null
);
create table Admin (
    id varchar(255) primary key ,
    full_name varchar(255) not null ,
    email varchar(255) not null ,
    password varchar(255) not null
);
create table Flight (
    id varchar(255) primary key ,
    name varchar(255) not null ,
    description varchar(255) not null ,
    city_departure varchar(255) not null ,
    city_arrival varchar(255) not null ,
    date_departure DATE not null ,
    date_arrival DATE not null ,
    hour_departure TIME not null ,
    hour_arrival TIME not null
);
create table Reservation (
    id varchar(255) primary key ,
    city_departure varchar(255) not null ,
    city_arrival varchar(255) not null ,
    date_departure DATE not null ,
    date_arrival DATE not null ,
    hour_departure TIME not null ,
    hour_arrival TIME not null ,
    number_place INT not null ,
    tarif float not null,
    client_id varchar(255) not null ,
    flight_id varchar(255) not null ,
    foreign key (client_id) references Clients(code),
    foreign key (flight_id) references Flight(id)
);
create table Statistics (
    id varchar(255) primary key ,
    reservation_confirme INT not null ,
    reservation_annule INT not null
);
create table Extra (
    id varchar(255) primary key ,
    name varchar(255) not null ,
    tarif float not null
);