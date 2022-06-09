CREATE DATABASE  IF NOT EXISTS `bd-Sistema-Integrador` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `bd-Sistema-Integrador`;

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

DROP TABLE IF EXISTS `departamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;

CREATE TABLE `departamento` (
  `id_departamento` int(11) NOT NULL AUTO_INCREMENT,
  `departamento` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id_departamento`)

) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

DROP TABLE IF EXISTS `Carrera`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;

CREATE TABLE `carrera` (
  `id_carrera` int(11) NOT NULL AUTO_INCREMENT,
  `carrera` varchar(45) NOT NULL,
  `id_departamento` int(11) NOT NULL,

  PRIMARY KEY (`id_carrera`),
  KEY `FKpnxin11usxve7lp2hv28ycyjh` (`id_departamento`),

  CONSTRAINT `FKpnxin11usxve7lp2hv28ycyjh` FOREIGN KEY (`id_departamento`) REFERENCES `departamento` (`id_departamento`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

DROP TABLE IF EXISTS `materia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;

CREATE TABLE `materia` (
  `id_materia` int(11) NOT NULL AUTO_INCREMENT,
  `cod_materia` int(11) NOT NULL,
  `materia` varchar(45) NOT NULL,
  `id_carrera` int(11) NOT NULL,

  PRIMARY KEY (`id_materia`),
  KEY `FKpw211cqmud0bc08lpqu90acw8` (`id_carrera`),

  CONSTRAINT `FKpw211cqmud0bc08lpqu90acw8` FOREIGN KEY (`id_carrera`) REFERENCES `carrera` (`id_carrera`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

DROP TABLE IF EXISTS `edificio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;

CREATE TABLE `edificio` (
  `id_edificio` int(11) NOT NULL AUTO_INCREMENT,
  `edificio` varchar(30) DEFAULT NULL,

  PRIMARY KEY (`id_edificio`)

) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

DROP TABLE IF EXISTS `aula`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `aula` (
  `id_aula` int(11) NOT NULL AUTO_INCREMENT,
  `numero` int(11) NOT NULL,
  `id_edificio` int(11) NOT NULL,
  PRIMARY KEY (`id_aula`),

   KEY `FKgvg5a2mgjvya8xwgio1s35956` (`id_edificio`),
   CONSTRAINT `FKgvg5a2mgjvya8xwgio1s35956` FOREIGN KEY (`id_edificio`) REFERENCES `edificio` (`id_edificio`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

DROP TABLE IF EXISTS `nota_pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nota_pedido` (
  `id_nota_pedido` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` date NOT NULL,
  `turno` char NOT NULL,
  `id_aula` int(11) NOT NULL,
  `cant_estudiantes` int(11) NOT NULL,
  `id_materia` int(11) NOT NULL,
  `observaciones` varchar(45) NOT NULL,

  PRIMARY KEY (`id_nota_pedido`),

   KEY `fk_NotaPedido_1_idx` (`id_aula`),
   KEY `fk_NotaPedido_2_idx` (`id_materia`),
   CONSTRAINT `fk_NotaPedido_1` FOREIGN KEY (`id_aula`) REFERENCES `aula` (`id_aula`),
   CONSTRAINT `fk_NotaPedido_2` FOREIGN KEY (`id_materia`) REFERENCES `materia` (`id_materia`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

DROP TABLE IF EXISTS `final`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `final` (
   `id_final` int(11) NOT NULL,
  `fecha_examen` date DEFAULT NULL,

  PRIMARY KEY (`id_final`),
  CONSTRAINT `FKjpk7mpfd2svjfpvgaj4x70s9r` FOREIGN KEY (`id_final`) REFERENCES `nota_pedido` (`id_nota_pedido`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

DROP TABLE IF EXISTS `curso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `curso` (
   `id_curso` int(11) NOT NULL,
  `cod_curso` varchar(45) DEFAULT NULL,

  PRIMARY KEY (`id_curso`),
  

  CONSTRAINT `FKoan8fak6ifarcx3j6glfuf5m5` FOREIGN KEY (`id_curso`) REFERENCES `nota_pedido` (`id_nota_pedido`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

DROP TABLE IF EXISTS `laboratorio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `laboratorio` (
  `id_laboratorio` int(11) NOT NULL,
  `cant_pc` int(11) DEFAULT NULL,
  `cant_sillas` int(11) DEFAULT NULL,

  PRIMARY KEY (`id_laboratorio`),

  CONSTRAINT `fk_Aula_2` FOREIGN KEY (`id_laboratorio`) REFERENCES `aula` (`id_aula`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

DROP TABLE IF EXISTS `tradicional`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tradicional` (
  `id_tradicional` int(11) NOT NULL,
  `cant_bancos` int(11) DEFAULT NULL,
  `pizarron` varchar(45) DEFAULT NULL,
   `tiene_proyector` tinyint(4) DEFAULT NULL,

  PRIMARY KEY (`id_tradicional`),

  CONSTRAINT `fk_Aula_3` FOREIGN KEY (`id_tradicional`) REFERENCES `aula` (`id_aula`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

DROP TABLE IF EXISTS `espacio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;


CREATE TABLE `espacio` (
  `id_espacio` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` date NOT NULL,
  `turno` char NOT NULL,
  `id_aula` int(11) NOT NULL,
  `libre` tinyint(4) DEFAULT NULL,

  PRIMARY KEY (`id_espacio`),
  KEY `FKeubgg3n2nn6959ix7e8t5pda0` (`id_aula`),

  CONSTRAINT `FKeubgg3n2nn6959ix7e8t5pda0` FOREIGN KEY (`id_aula`) REFERENCES `aula` (`id_aula`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;


insert into user_role values(1,now(),'ROLE_ADMIN',now()) ,(2,now(),'ROLE_AUDITOR',now());
insert into user values(1,'apellidoUser',now(),123,'user@gmail.com',1,'userNombre','$2a$10$WIa5PHoUh5a1mMLKHoejneczGu0GsiJNfnTbU78EKxOFw8Ca3/GOa','DNI',now(),'user',1);

select * from user;
select * from user_role;

insert into edificio values(1,'herandez');
insert into aula values(1,1,1);
insert into aula values(2,2,1);
insert into aula values(3,1,3);

insert into tradicional values(10,'tiza',1,1);
insert into laboratorio values(10,10,2);

insert into espacio values(1,now(),true,'M',1);
insert into espacio values(2,now(),false,'T',1);

select* from espacio;
select* from edificio;
select * from aula;
select * from tradicional;
select * from laboratorio;
select  * from user;
select * from user_role;
