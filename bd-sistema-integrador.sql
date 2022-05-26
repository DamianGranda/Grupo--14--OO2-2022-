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

DROP TABLE IF EXISTS `Departamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;

CREATE TABLE `Departamento` (
  `idDepartamento` int(11) NOT NULL AUTO_INCREMENT,
  `departamento` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`idDepartamento`)

) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

DROP TABLE IF EXISTS `Carrera`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;

CREATE TABLE `Carrera` (
  `idCarrera` int(11) NOT NULL AUTO_INCREMENT,
  `carrera` varchar(45) NOT NULL,
  `idDepartamento` int(11) NOT NULL,

  PRIMARY KEY (`idCarrera`),
  KEY `fk_Carrera_1_idx` (`idDepartamento`),

  CONSTRAINT `fk_Carrera_1` FOREIGN KEY (`idDepartamento`) REFERENCES `Departamento` (`idDepartamento`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

DROP TABLE IF EXISTS `Materia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;

CREATE TABLE `Materia` (
  `idMateria` int(11) NOT NULL AUTO_INCREMENT,
  `codMateria` int(11) NOT NULL,
  `Materia` varchar(45) NOT NULL,
  `idCarrera` int(11) NOT NULL,

  PRIMARY KEY (`idMateria`),
  KEY `fk_Materia_1_idx` (`idCarrera`),

  CONSTRAINT `fk_Materia_1` FOREIGN KEY (`idCarrera`) REFERENCES `Carrera` (`idCarrera`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

DROP TABLE IF EXISTS `Edificio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;

CREATE TABLE `Edificio` (
  `idEdificio` int(11) NOT NULL AUTO_INCREMENT,
  `edificio` varchar(30) DEFAULT NULL,

  PRIMARY KEY (`idEdificio`)

) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

DROP TABLE IF EXISTS `Aula`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Aula` (
  `idAula` int(11) NOT NULL AUTO_INCREMENT,
  `numero` int(11) NOT NULL,
  `idEdificio` int(11) NOT NULL,
  PRIMARY KEY (`idAula`),

   KEY `fk_Aula_1_idx` (`idEdificio`),
   CONSTRAINT `fk_Aula_1` FOREIGN KEY (`idEdificio`) REFERENCES `Edificio` (`idEdificio`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

DROP TABLE IF EXISTS `NotaPedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `NotaPedido` (
  `idNotaPedido` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` date NOT NULL,
  `turno` char NOT NULL,
  `idAula` int(11) NOT NULL,
  `cantEstudiantes` int(11) NOT NULL,
  `idMateria` int(11) NOT NULL,
  `observaciones` varchar(45) NOT NULL,

  PRIMARY KEY (`idNotaPedido`),

   KEY `fk_NotaPedido_1_idx` (`idAula`),
   KEY `fk_NotaPedido_2_idx` (`idMateria`),
   CONSTRAINT `fk_NotaPedido_1` FOREIGN KEY (`idAula`) REFERENCES `Aula` (`idAula`),
   CONSTRAINT `fk_NotaPedido_2` FOREIGN KEY (`idMateria`) REFERENCES `Materia` (`idMateria`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

DROP TABLE IF EXISTS `Final`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Final` (
  `idFinal` int(11) NOT NULL,
  `fechaExamen` date DEFAULT NULL,

  PRIMARY KEY (`idFinal`),
  CONSTRAINT `fk_NotaPedido_3` FOREIGN KEY (`idFinal`) REFERENCES `NotaPedido` (`idNotaPedido`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

DROP TABLE IF EXISTS `Curso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Curso` (
  `idCurso` int(11) NOT NULL,
  `codCurso` varchar(45) DEFAULT NULL,

  PRIMARY KEY (`idCurso`),
  CONSTRAINT `fk_NotaPedido_4` FOREIGN KEY (`idCurso`) REFERENCES `NotaPedido` (`idNotaPedido`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

DROP TABLE IF EXISTS `Laboratorio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Laboratorio` (
  `idLaboratorio` int(11) NOT NULL,
  `cantPC` int(11) DEFAULT NULL,
  `cantSillas` int(11) DEFAULT NULL,

  PRIMARY KEY (`idLaboratorio`),

  CONSTRAINT `fk_Aula_2` FOREIGN KEY (`idLaboratorio`) REFERENCES `Aula` (`idAula`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

DROP TABLE IF EXISTS `Tradicional`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Tradicional` (
  `idTradicional` int(11) NOT NULL,
  `cantBancos` int(11) DEFAULT NULL,
  `pizarron` varchar(45) DEFAULT NULL,
   `tieneProyector` tinyint(4) DEFAULT NULL,

  PRIMARY KEY (`idTradicional`),

  CONSTRAINT `fk_Aula_3` FOREIGN KEY (`idTradicional`) REFERENCES `Aula` (`idAula`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

DROP TABLE IF EXISTS `Espacio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;

CREATE TABLE `Espacio` (
  `idEspacio` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` date NOT NULL,
  `turno` char NOT NULL,
  `idAula` int(11) NOT NULL,
  `libre` tinyint(4) DEFAULT NULL,

  PRIMARY KEY (`idEspacio`),
  KEY `fk_Espacio_1_idx` (`idAula`),

  CONSTRAINT `fk_Espacio_1` FOREIGN KEY (`idAula`) REFERENCES `Aula` (`idAula`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;