create database examen2Ej2;

create table alumno 
(numero int primary key, nombre varchar(50), apellido varchar(50), sexo char);
select * from examen2Ej2.alumno;

create table grupo 
(numero int primary key, materia varchar(50), horario varchar(60), profesor varchar(100));
select * from examen2Ej2.grupo;

create table inscribir 
(id int primary key, numero_alumno int, numero_grupo int,  
foreign key (numero_alumno) references alumno (numero), 
foreign key (numero_grupo) references grupo (numero));
select * from examen2Ej2.inscribir;