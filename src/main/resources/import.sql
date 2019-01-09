drop table if exists grid_floor;
create table grid_floor (id varchar primary key, height varchar, width varchar);
insert into grid_floor (id, height, width) values ('room', 100, 100);