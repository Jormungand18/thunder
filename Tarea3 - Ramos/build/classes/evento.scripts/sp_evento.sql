--insercion de registro en tb_evento
CREATE PROCEDURE sp_insertar_evento
     (in Id int(11), in Nombre varchar(50), in Fecha varchar(50), in Direccion varchar(50), in Capacidad int(11))
    
insert into event values(Id,Nombre,Fecha,Direccion,Capacidad);

-- eliminacion en tb_evento
CREATE PROCEDURE sp_eliminar_evento(in Id int(11))
     delete from event where ev_Id=Id;

CREATE PROCEDURE sp_find_evento(in Id int(11))
     select * from curso where ev_Id=Id;

-- actualizacion en tb_evento

CREATE PROCEDURE sp_actualizar_evento(in Id int(11), in Nombre varchar(50), in Fecha varchar(50), in Direccion varchar(50), in Capacidad int(11))
  
    update event set Id=ev_Id, Nombre=ev_Nombre, Fecha=ev_Fecha, Direccion=ev_Direccion, Capacidad=ev_Capacidad where ev_Id=Id;

--listar tb_evento
CREATE PROCEDURE sp_listar_evento()
     select * from event;

