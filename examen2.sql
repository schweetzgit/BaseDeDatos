create database examen2;

create table edificios (Eno varchar(5) primary key, Nombre varchar(50), Calle varchar(50), Numero int, 
Delegacion varchar(100), CP int, Telefono varchar(15));
select * from examen2.edificios;

create table consultorios (Con varchar(5) primary key, Edificio varchar(5), Piso int, Tamano int,
Escritorios int, Camillas int, foreign key (Edificio) references Edificios (eno));
select * from examen2.consultorios;

create table medicos (Mno varchar(10) primary key, Nombre varchar(30), Apellido1 varchar(30),
Apellido2 varchar(30), Especialidad varchar(50), Consultorio varchar(5), Turno char,
foreign key (consultorio) references consultorios(Con));
select * from examen2.medicos;

insert into edificios values
('I','IZTAPALAPA','Ermita',15,'Iztapalapa',56565,3399998),
('II','NAUCALPAN','Echegaray',200,'Naucalpan',73738,738883889);

insert into consultorios values
('A1','I',1,9,2,1),('A2','I',1,9,2,1),
('B1','I',1,6,2,1),('B2','I',1,6,2,1),
('C1','I',2,6,1,2),('C2','I',2,6,1,2),
('D1','II',1,4,2,1),('D2','II',1,4,2,1),
('E1','II',2,6,1,1),('F1','II',2,6,1,1);

insert into medicos values
('A001','Luis','Lopez','Lopez','Ginecologia','A1','M'),
('A002','Dante','Marines','Montero','Odontologia','E1','M'),
('A003','Mariel','Juarez','Gutierrez','Gastroenterologia','D1','M'),
('A004','Josefina','Gutierrez','Garcia','Pediatria','B2','M'),
('A005','Alan Jorge','Flores','Escutia','Otorrinolaringologia','C1','M'),
('A006','Patricia','Perez','Garcia','Oncologia','F1','V'),
('A007','Diego','Acosta','Zambrano','Pediatria','B1','M'),
('A008','Zoila','Gutierrez','Sapiain','Nutricion','B2','V'),
('A009','Samanta','Gomez','Castañeda','Otorrinolaringologia','C1','V'),
('A0010','Juan Pablo','Gomez','Roque','Pediatria','B1','V'),
('A0011','Anuar','Larios','Villegas','Ginecologia','A1','V');

select * from examen2.consultorios;
select * from examen2.edificios;
select * from examen2.medicos;

/* a. Nombres de los Otorrinolaringólogos*/
select nombre, especialidad
from medicos
where especialidad = 'Otorrinolaringologia';

/* b. Los consultorios con tamaño mayor a 5*/
select con, tamano
from consultorios
where tamano > 5;

/* c. Los nombres de los médicos y el tamaño de los consultorios 
para los aquellos que atienden en un consultorio de tamaño mayor a 4*/
select nombre, tamano 
from medicos, consultorios 
where consultorio = con and tamano > 4;

/* d. Los nombres de los odontólogos del edificio 
de NAUCALPAN (utilizando una subconsulta)*/
select nombre, especialidad
from medicos 
where especialidad = 'Odontologia' and consultorio in
(select con from consultorios where edificio in
(select eno from edificios where nombre = 'NAUCALPAN'));

/* e. La cantidad de medicos por cada especialidad*/
select count(nombre), especialidad
from medicos
group by especialidad;

/* f. Las especialidades que tienen menos de 1 medico*/
select especialidad
from medicos
group by especialidad
having count(nombre) < 1;

/* g. La suma total de camillas por cada edificio*/
select sum(camillas), edificio
from consultorios
group by edificio;

/* h. Los nombres de los médicos cuyo primer apellido inicia con G, 
con especialidad en Pediatria o Nutrición que atienden en el turno matutino (M)*/
select nombre, apellido1, apellido2
from medicos
where apellido1  like 'G%' 
and (especialidad = 'Pediatria' or especialidad = 'Nutricion')
and turno = 'M';

/* i. Los nombres de los médicos y el nombre del edificio en 
el que atienden*/
select medicos.nombre, edificios.nombre
from medicos join consultorios join edificios
where consultorio = con and edificio = eno;






