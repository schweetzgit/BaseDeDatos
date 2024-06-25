CREATE DATABASE book;

CREATE TABLE libro 
(ISBN varchar(13) PRIMARY KEY, nombre varchar(120), paginas int, editorial varchar(45), edicion int, idioma varchar(50), encuadernacion varchar(45));
SELECT * FROM book.libro;

INSERT INTO libro VALUES('9780194776189','American English File',167,'Oxford',2017,'Inglés','Pasta blanda');
('9788449331565','El universo en una taza de café',336,'Planeta',2015,'Español','Pasta blanda'),
('9788423352883','Las mil y una noches',639,'Austral',2017,'Español','Pasta dura'),
('9788429453865','Sense and sensibility',127,'Richmond',2002,'Inglés','Pasta blanda'),
('9786070748547','El juego del cosmos',183,'Planeta',2018,'Español','Pasta blanda');


CREATE TABLE empleado 
(usuario int PRIMARY KEY, contrasena varchar(7), nombre varchar(50), apellidos varchar(50), RFC varchar(13), telefono varchar(15), direccion varchar(100), email varchar(30));
SELECT * FROM book.empleado;
/*INSERT INTO libro VALUES
('123386','WRYJWW1','Alejandro','Rosas Ortiz','ROOA981224','5512364829','Av. Mexico, Calle 1','ale@outlook.com'),
('496481','P733HKW','Vanessa','Rojas Martinez','ROMV011123','5513142618','Mexico, Av. Morelos','vanessa_rojas@correo.com'),
('578977','OKM5UF4','Alexa','Cortes Velazquez','COVA020207','5572819346','Calle Independencia, Col. Portales','alqxa_cortes@correo.com'),
('657808','27LGCN4','Yves','Cruz Flores','CRFY990512','5548693627','Mexico. Col. Pajaritos','yves_cruz@gmail.com'),
('970104','6ARNACI','Jose','Martinez Perez','MAPJ900314','9711651715','México, Av. Bucareli','jose90@gmail.com');*/

CREATE TABLE registro                                                                                                                                                                       
(movimiento varchar(12), seccion varchar(2), fecha varchar(20), usuario_emp int, libro_ISBN varchar(13),
FOREIGN KEY (usuario_emp) REFERENCES empleado (usuario) ON DELETE CASCADE, 
FOREIGN KEY (libro_ISBN) REFERENCES libro (ISBN) ON DELETE CASCADE); 
SELECT * FROM book.registro;

/*ALTER TABLE registro DROP FOREIGN KEY registro_ibfk_3;
ALTER TABLE registro ADD FOREIGN KEY (usuario_emp) REFERENCES empleado (usuario) ON DELETE CASCADE;

ALTER TABLE registro DROP FOREIGN KEY registro_ibfk_4;
ALTER TABLE registro ADD FOREIGN KEY (libro_ISBN) REFERENCES libro (ISBN) ON DELETE CASCADE;*/

INSERT INTO registro VALUES
('Registro','CN','2022/05/19 16:35:36','123386','9788449331565'),
('Registro','LT','2022/03/02 12:29:18','578977','9788423352883'),
('Registro','IM','2022/04/02 09:30:47','578977','9780194776189'),
('Modificación','MM','2022/04/02 10:00:26','657808','9781285057095');