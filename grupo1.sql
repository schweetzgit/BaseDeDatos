CREATE DATABASE GRUPO1;

create table VENDEDOR (Nombre varchar(25) PRIMARY KEY, 
PorcentajedeCuota int, Salario int);
alter table vendedor modify column Salario float;

create table CLIENTE (Nombre varchar(25) PRIMARY KEY,
Ciudad varchar(50), TipodeIndustria varchar(10));

create table PEDIDO (Numero int PRIMARY KEY, 
NombredeCliente varchar(50), NombredeVendedor varchar(50),
Cantidad int,
FOREIGN KEY (NombredeCliente) REFERENCES CLIENTE (Nombre),
FOREIGN KEY (NombredeVendedor) REFERENCES VENDEDOR (Nombre)); 
alter table pedido rename column NombredeCliente to NombredelCliente
alter table pedido rename column NombredeVendedor to NombredelVendedor

insert into vendedor values ('Abel',63,120000), ('Baker',38,42000),
('Jones',26,36000), ('Murphy',42,50000), ('Zenith',59,118000),
('Kobad',27,36000);
select * from vendedor;

insert into cliente values ('Abernathy Construction','Willow','B'),
('Manchester Lumber','Manchester','F'),
('Tri-City Builders','Memphis','B'),
('Amalgamated Housing','Memphis','B');
select * from cliente;

insert into pedido values (100,'Abernathy Construction','Zenith',560),
(200,'Abernathy Construction','Jones',1800),
(300,'Manchester Lumber','Abel',480),
(400,'Amalgamated Housing','Abel',2500),
(500,'Abernathy Construction','Murphy',6000),
(600,'Tri-City Builders','Abel',700),
(700,'Manchester Lumber','Jones',150);
select * from pedido;

/*9.1 Muestre los salarios de todos los vendedores*/
select salario
from vendedor

/*9.2 Muestre los salarios de todos los vendedores, pero omita duplicados*/
select distinct salario
from vendedor

/*9.3 Muestre los nombres de todos los vendedores que están por
debajo del 30% de la cuota*/
select nombre
from vendedor
where porcentajedecuota < 30

/*9.4 Muestre los nombres de todos los vendedores que tengan un 
pedido con Abernathy Construction*/
select nombredelvendedor
from pedido
where nombredelcliente = 'Abernathy Construction'

/*9.5 Muestre los nombres de todos los vendedores que ganan más de
$49999 y menos de $100000*/
select nombre
from vendedor
where salario > 49999 and salario < 100000

/*9.6 Muestre los nombres de todos los vendedores con un PorcentajedeCuota
mayor a 49 y menos de 60. Use la palabra resevada BETWEEN*/
select nombre
from vendedor
where porcentajedecuota between 49 and 60

/*9.7 Muestre los nombres de todos los vendedores con un PorcentajedeCuota 
de más de 49 y menos de 60. Use la palabra resevada LIKE*/
select nombre
from vendedor
where porcentajedecuota like '5%'

/*9.8 Muestre los nombres de los clientes que se localicen en una
Ciudad que termine con S*/
select nombre
from cliente
where ciudad like '%s'

/*9.9 Muestre los nombres y los salarios de todos los vendedores que no tengan 
un pedido con Abernathy Constructions, en orden ascendente de salario*/
select distinct vendedor.nombre, vendedor.salario
from vendedor join pedido
on nombre = nombredelvendedor
where pedido.nombredelcliente != 'Abernathy Construction'
order by vendedor.salario asc

/*9.10 Calcule el número de pedidos*/
select count(numero)
from pedido

/*9.11 Calcule el número de diferentes clientes que tienen un pedido*/
select count(distinct nombredelcliente)
from pedido

/*9.12 Calcule el porcentaje promedio de cuota para los vendedores*/
select avg(porcentajedecuota)
from vendedor

/*9.13 Muestre el nombre del vendedor con el porcentaje de cuota más alto*/
select nombre
from vendedor
where porcentajedecuota in
(select max(porcentajedecuota) from vendedor)

/*9.14 Calcule el número de pedidos de cada vendedor*/
select count(distinct nombredelcliente), nombredelvendedor
from pedido
group by nombredelvendedor

/*9.15 Calcule el número de pedidos de cada vendedor, considerando sólo los
pedidos que excedan de 500*/
select count(distinct nombredelcliente), nombredelvendedor
from pedido
where cantidad > 500
group by nombredelvendedor

/*9.16 Muestre los nombres y porcentajes de los vendedores que 
tienen un pedido con Abernathy Constrcution, en orden descendente de porcentaje de cuota
(use una subconsulta)*/
select nombre, porcentajedecuota
from vendedor
where nombre in
(select nombredelvendedor from pedido 
where nombredelcliente = 'Abernathy Construction')
order by porcentajedecuota desc

/*9.17 Muestre los nombres y porcentajes de cuota de los vendedores que 
tienen un pedido con Abernathy Constrcution, en orden descendente de porcentaje de cuota
(use un join)*/
select nombre, porcentajedecuota
from vendedor join pedido
on nombre = nombredelvendedor
where pedido.nombredelcliente = 'Abernathy Construction'
order by porcentajedecuota desc

/*9.18 Muestre los porcentajes de cuota de los vendedores que 
tengan un pedido con un cliente en Memphis (use una subconsulta)*/
select porcentajedecuota
from vendedor
where nombre in
(select nombredelvendedor from pedido where nombredelcliente in
(select nombre from cliente where ciudad = 'Memphis'))

select porcentajedecuota, nombre
from vendedor join 
where nombre in
(select nombredelvendedor
from cliente join pedido
on nombre = nombredelcliente
where ciudad = 'Memphis')

/*9.19 Muestre los porcentajes de cuota de los vendedores que 
tengan un pedido con un cliente en Memphis (use un join)*/
select distinct vendedor.porcentajedecuota
from vendedor join cliente join pedido
where vendedor.nombre = nombredelvendedor
and nombredelcliente = cliente.nombre
and ciudad = 'Memphis'

/*9.20 Muestre el tipo de insdustria y los nombres de los vendedores de todos
los pedidos para las compañias en Memphis)*/
select cliente.tipodeindustria, pedido.nombredelvendedor
from cliente, pedido
where nombredelcliente = nombre and ciudad = 'Memphis'

/*9.21 Muestre los nombres de los vendedores junto con los nombres de los 
clientes que les hayan hecho un pedido. Incluya a los vendedores que no tengan
pedidos)*/
select nombre, nombredelcliente
from vendedor left join pedido
on nombredelvendedor = nombre

/*select nombredelvendedor, count(*) */
/*9.22 Muestre los nombres de los vendedores que tengan dos o más pedidos*/
select nombredelvendedor 
from pedido
group by nombredelvendedor
having count(nombredelcliente) >= 2 

order by count(*)

/*9.23 Muestre los nombres y porcentajes de cuota de los vendedores que 
tengan dos o más pedidos*/
select nombre, porcentajedecuota
from vendedor
where nombre in
(select nombredelvendedor from pedido
where nombre = nombredelvendedor 
group by nombredelvendedor
having count(nombredelcliente) >= 2)

order by count(*))

/*9.24 Muestre los nombres y edades de los vendedores que tengan un pedido
con todos los clientes*/
select nombre
from vendedor
where exists 
(select nombredelvendedor from pedido
where nombredelcliente = vendedor.nombre and exists
(select nombredelcliente from cliente where nombredelcliente = cliente.nombre))