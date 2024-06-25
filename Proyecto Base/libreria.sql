CREATE DATABASE libreria;

CREATE TABLE cliente 
(numero int PRIMARY KEY, telefono varchar(15) NOT NULL, 
direccion varchar(100) NOT NULL, nombre varchar(50) NOT NULL, 
RFC varchar(13) NOT NULL);
SELECT * FROM libreria.cliente;

CREATE TABLE libro 
(ISBN varchar(50) PRIMARY KEY, nombre varchar(120), seccion char(1), edicion int, 
editorial varchar(50), idioma varchar(50), encuadernacion varchar(45), paginas int);
SELECT * FROM libreria.libro;

CREATE TABLE pedido
(num_pedido varchar(50) PRIMARY KEY, num_pago varchar(50) NOT NULL,
num_envio varchar(50) NOT NULL, cliente_numero int, libro_ISBN varchar(50), 
FOREIGN KEY (cliente_numero) REFERENCES cliente (numero), 
FOREIGN KEY (libro_ISBN) REFERENCES libro (ISBN))
SELECT * FROM libreria.pedido;

alter table pedido drop foreign key pedido_ibfk_1;
alter table pedido drop foreign key pedido_ibfk_2;
ALTER TABLE pedido ADD FOREIGN KEY (libro_ISBN) REFERENCES libro (ISBN) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE pedido ADD FOREIGN KEY (cliente_numero) REFERENCES cliente (numero) ON DELETE CASCADE ON UPDATE CASCADE;

CREATE TABLE empleado 
(usuario int(5) PRIMARY KEY, contraseña varchar(7), seclibro char(1), nombre varchar(50), 
apellidos varchar(50), telefono varchar(15), direccion varchar(100), email varchar(30),
FOREIGN KEY (seclibro) REFERENCES libro (seccion)); 
SELECT * FROM libreria.cliente;
