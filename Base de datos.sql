create table usuario (
id_usuario serial primary key,
nombre varchar,
apellido_p varchar,
apellido_m varchar,
usuario varchar,
password varchar,
telefono varchar,
status varchar default 'Activo'
);

create table personal(
id_personal serial primary key,
rol varchar not null,
nombre varchar not null,
apellido_p varchar not null,
apellido_m varchar not null,
edad int not null
);

create table cat_servicio(
id_servicio serial primary key,
tipo_servicio varchar
);
create table tarifa(
consec int,
id_servicio int,
tarifa float,
FOREIGN KEY (id_servicio) references cat_servicio (id_servicio),
primary key (consec, id_servicio)
);

insert into tarifa values (1,1,10.00);
insert into tarifa values (2,2,6.00);
insert into tarifa values (3,3,13.00);
insert into tarifa values (4,4,9.00);

create table ventas(
id_venta serial primary key,
id_producto int references productos,
id_producto int references productos,
id_producto int references productos,
id_materia int references materia_prima,
fecha date not null,
cantidad int not null,
importe float not null,
pago float not null,
cambio float not null,
id_servicio int references cat_servicio not null,
id_personal int references personal not null
);

create table clientes(
id_cliente serial primary key,
nombre varchar,
apellido_p varchar,
apellido_m varchar,
telefono varchar,
residencia varchar,
calle varchar,
manzana varchar,
lote varchar
);

create table dias(
id_dia serial,
dia varchar
);

create table meses(
id_mes serial,
mes varchar
);

create table agenda(
id_agenda serial,
id_cliente int references clientes,
id_dia int references dias,
id_mes int references meses
);
create table agenda_semanal(
id_agenda serial primary key,
id_cliente int references clientes,
Lunes varchar,
Martes varchar,
Miercoles varchar,
Jueves varchar,
Viernes varchar,
Sabado varchar,
id_mes int references meses
);
create table proveedores(
id_proveedor serial primary key,
razon_social varchar,
telefono varchar,
email varchar,
direccion varchar,
categoria varchar,
status varchar default 'Activo'
);

create table materia_prima(
id_materia serial primary key not null,
id_proveedor int references proveedores not null,
nombre varchar not null,
descripcion varchar not null,
estado varchar default 'En stock',
status varchar default 'Activo'
);

create table productos(
id_producto serial primary key not null,
id_proveedor int references proveedores not null,
nombre varchar not null,
descripcion varchar(100) not null,
estado varchar default 'En stock',
status varchar default 'Activo'
);

create table entrada_productos(
id_entrada serial primary key not null,
id_producto int references productos not null,
id_factura varchar default 'Sin factura',
fecha date not null,
cantidad int not null,
precio_compra float not null,
);

create table salida_productos(
id_salida serial primary key not null,
id_producto int references productos not null,
fecha date not null,
concepto varchar not null,
cantidad int not null
);

create table entrada_materiaprim(
id_entrada_mat serial primary key not null,
id_materia int references materia_prima not null,
id_factura_mat varchar default 'Sin factura',
fecha date not null,
cantidad float not null,
precio_compra_mat float not null
);

create table salida_materiaprim(
id_salida_mat serial primary key not null,
id_materia int references materia_prima not null,
fecha date not null,
concepto varchar not null,
cantidad float not null
);

create table inventario_productos(
inv_prod_codigo int primary key not null,
inv_entradas int default 0,
inv_salidas int default 0,
inv_stock int default 0
);

create table inventario_materiaprim(
inv_mat_codigo int primary key not null,
inv_entradas int default 0,
inv_salidas int default 0,
inv_stock int default 0
);

-----
CREATE OR REPLACE FUNCTION inv_productos() RETURNS TRIGGER AS $inv_productos$
BEGIN
UPDATE inventario_productos 
SET inv_stock = inv_stock+NEW.cantidad, inv_entradas = inv_entradas+NEW.cantidad 
where inv_prod_codigo = NEW.id_producto;
RETURN new;
END;
$inv_productos$ LANGUAGE plpgsql;
CREATE TRIGGER INVENTARIO_AI AFTER INSERT ON entrada_productos 
FOR EACH ROW EXECUTE PROCEDURE inv_productos();
-----

-----
CREATE OR REPLACE FUNCTION inv_materiaprim() RETURNS TRIGGER AS $inv_materiaprim$
BEGIN
UPDATE inventario_materiaprim 
SET inv_stock = inv_stock+NEW.cantidad, inv_entradas = inv_entradas+NEW.cantidad 
where inv_mat_codigo = NEW.id_materia;
RETURN new;
END;
$inv_materiaprim$ LANGUAGE plpgsql;
CREATE TRIGGER INVENTARIO_MP AFTER INSERT ON entrada_materiaprim 
FOR EACH ROW EXECUTE PROCEDURE inv_materiaprim();
-----
--PROCEDURE 'NUEVO_PRODUCTO' ('CODIGO' varchar  INSERT INTO inventario_productos (inv_pro_codigo) VALUES (CODIGO)
CREATE PROCEDURE NUEVO_PRODUCTO (CODIGO int) 
LANGUAGE SQL
AS $$
INSERT INTO inventario_productos (inv_prod_codigo) VALUES (CODIGO);
$$;
-----
--PROCEDURE 'NUEVA_MATERIA' ('CODIGO' varchar  INSERT INTO inventario_materiaprim (inv_pro_codigo) VALUES (CODIGO)
CREATE PROCEDURE NUEVA_MATERIA (CODIGO int)
LANGUAGE SQL
AS $$
INSERT INTO inventario_materiaprim (inv_mat_codigo) VALUES (CODIGO)
$$;
-----

-----
CREATE OR REPLACE FUNCTION inv_productos_s() RETURNS TRIGGER AS $inv_productos_s$
BEGIN
UPDATE inventario_productos 
SET inv_stock = inv_stock-NEW.cantidad, inv_salidas = inv_salidas+NEW.cantidad 
where inv_prod_codigo = NEW.id_producto;
RETURN new;
END;
$inv_productos_s$ LANGUAGE plpgsql;
CREATE TRIGGER INVENTARIO_S_AI AFTER INSERT ON salida_productos 
FOR EACH ROW EXECUTE PROCEDURE inv_productos_s();
-----
CREATE TRIGGER INVENTARIO_S_V AFTER INSERT ON ventas 
FOR EACH ROW EXECUTE PROCEDURE inv_materiaprim_s();
-----
CREATE OR REPLACE FUNCTION inv_materiaprim_s() RETURNS TRIGGER AS $inv_materiaprim_s$
BEGIN
UPDATE inventario_materiaprim
SET inv_stock = inv_stock-NEW.cantidad, inv_salidas = inv_salidas+NEW.cantidad 
where inv_mat_codigo = NEW.id_materia;
RETURN new;
END;
$inv_materiaprim_s$ LANGUAGE plpgsql;
CREATE TRIGGER INVENTARIO_S_MP AFTER INSERT ON salida_materiaprim 
FOR EACH ROW EXECUTE PROCEDURE inv_materiaprim_s();
--------------------
CREATE OR REPLACE FUNCTION inv_materiaprim_s() RETURNS TRIGGER AS $inv_materiaprim_s$
BEGIN
UPDATE inventario_materiaprim
SET inv_stock = inv_stock-NEW.cantidad, inv_salidas = inv_salidas+NEW.cantidad 
where inv_mat_codigo = NEW.id_materia;
RETURN new;
END;
$inv_materiaprim_s$ LANGUAGE plpgsql;
CREATE TRIGGER INVENTARIO_S_MP AFTER INSERT ON salida_materiaprim 
FOR EACH ROW EXECUTE PROCEDURE inv_materiaprim_s();
--------------------
select ip.inv_prod_codigo,pc.descripcion,ip.inv_entradas,ip.inv_salidas,ip.inv_stock from inventario_productos ip inner join productos pc on ip.inv_prod_codigo = pc.id_producto
---------------------
select mp.id_materia, pv.razon_social,mp.descripcion,mp.estado from materia_prima mp inner join proveedores pv on pv.id_proveedor = mp.id_proveedor