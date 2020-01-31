/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  FREDY
 * Created: 27/01/2019
 */

drop procedure sp_ins_evento
CREATE PROCEDURE sp_ins_evento(in id_evento INT(10),in nombre VARCHAR(40), in fecha VARCHAR(40), in direccion VARCHAR(40), in capacidad INT(10))
     insert into evento values(id_evento,nombre,fecha,direccion,capacidad);

CREATE PROCEDURE sp_upd_evento(in id_evento INT(10),in nombre VARCHAR(40), in fecha VARCHAR(40), in direccion VARCHAR(40), in capacidad INT(10))
     update evento set nombre=nombre, fecha=fecha, direccion=direccion, capacidad=capacidad where id_evento=id_evento;

CREATE PROCEDURE sp_del_evento(in cod CHAR(3))
     delete from evento where id_evento=id_evento;

CREATE PROCEDURE sp_findAll_evento()
     select * from evento;

CREATE PROCEDURE sp_find_evento(in cod CHAR(3))
     select * from evento where id_evento=id_evento;

CREATE PROCEDURE sp_login(in user CHAR(10),in pass CHAR(10))
     select * from administrador where id=user and password=pass;