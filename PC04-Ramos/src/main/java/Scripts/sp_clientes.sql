--insercion de registro en tb_evento
CREATE PROCEDURE sp_insertar_cliente
     (in Idcliente int(11), in Apellido varchar(50), in Nombre varchar(50), in Correo varchar(50), in Telefono varchar(50))
    
insert into clientes values(Idcliente,Apellido,Nombre,Correo,Telefono);

-- eliminacion en tb_evento
CREATE PROCEDURE sp_eliminar_cliente(in Idcliente int(11))
     delete from clientes where idcliente=Idcliente;

CREATE PROCEDURE sp_find_cliente(in Idcliente int(11))
     select * from clientes where idcliente=Idcliente;

-- actualizacion en tb_evento

CREATE PROCEDURE sp_actualizar_cliente(in Idcliente int(11), in Apellido varchar(50), in Nombre varchar(50), in Correo varchar(50), in Telefono varchar(50))
     update clientes set apellidos=Apellido, nombres=Nombre, correo=Correo, telefono=Telefono where idcliente=Idcliente;

--listar tb_evento
CREATE PROCEDURE sp_listar_cliente()
     select * from clientes;

