CREATE TABLE `PERSONA` ( 
  `ID`                 INTEGER(10) NOT NULL,
  `NOMBRE`             VARCHAR(40) NOT NULL,
  `APELLIDOS`          VARCHAR(40) NOT NULL,
  `CORREO`             VARCHAR(40) NOT NULL,
CONSTRAINT `PK_PERSONA` PRIMARY KEY (`ID`)
);

CREATE TABLE `EXPOSITORES` ( 
  `ESPECIALIDAD`       VARCHAR(40) NOT NULL,
  `ID`                 INTEGER(10) NOT NULL,
CONSTRAINT `PK_EXPOSITORES` PRIMARY KEY (`ID`)
);

CREATE TABLE `ASISTENTES` ( 
  `TELEFONO`           INTEGER(10) NOT NULL,
  `DIRECCION`          VARCHAR(40) NOT NULL,
  `ID`                 INTEGER(10) NOT NULL,
CONSTRAINT `PK_ASISTENTES` PRIMARY KEY (`ID`)
);

CREATE TABLE `EVENTO` ( 
  `ID_EVENTO`          INTEGER(10) NOT NULL,
  `NOMBRE`             VARCHAR(40) NOT NULL,
  `FECHA`              VARCHAR(40) NOT NULL,
  `DIRECCION`          VARCHAR(40) NOT NULL,
  `CAPACIDAD`          INTEGER(10) NOT NULL,
  `ID_EXPOSITOR`       INTEGER(10),
  `ID_ASISTENTE`       INTEGER(10),
CONSTRAINT `PK_EVENTO` PRIMARY KEY (`ID_EVENTO`)
);

CREATE TABLE `ADMINISTRADOR` ( 
  `PASSWORD`           VARCHAR(40) NOT NULL,
  `LOGIN`              VARCHAR(10) NOT NULL,
CONSTRAINT `ADMINISTRADOR` PRIMARY KEY (`LOGIN`)
);

/*============================================================================*/
/*                               FOREIGN KEYS                                 */
/*============================================================================*/
ALTER TABLE `EXPOSITORES`
    ADD CONSTRAINT `FK_REFERENCE_1`
        FOREIGN KEY (`ID`)
            REFERENCES `PERSONA` (`ID`)
 ;
 

ALTER TABLE `ASISTENTES`
    ADD CONSTRAINT `FK_REFERENCE_2`
        FOREIGN KEY (`ID`)
            REFERENCES `PERSONA` (`ID`)
 ;
 

ALTER TABLE `EVENTO`
    ADD CONSTRAINT `FK_REFERENCE_6`
        FOREIGN KEY (`ID_EXPOSITOR`)
            REFERENCES `EXPOSITORES` (`ID`)
 ;
 
ALTER TABLE `EVENTO`
    ADD CONSTRAINT `FK_REFERENCE_7`
        FOREIGN KEY (`ID_ASISTENTE`)
            REFERENCES `ASISTENTES` (`ID`)
 ;
 

insert Administrador values('admin','admin');
insert Administrador values('user','user');

