-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: prueba2
-- ------------------------------------------------------
-- Server version	8.0.32

CREATE DATABASE prueba2;
USE prueba2;
/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `persons`
--

-- DROP TABLE IF EXISTS `persons`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `persons` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name_` varchar(50) NOT NULL,
  `surname` varchar(70) NOT NULL,
  `email` varchar(100) NOT NULL,
  `age` int NOT NULL,
  `sex` varchar(50) NOT NULL,
  `height` double NOT NULL,
  PRIMARY KEY (`id`)
);
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persons`
--

SELECT*FROM persons;
-- LOCK TABLES `persons` WRITE;
/*!40000 ALTER TABLE `persons` DISABLE KEYS */;
INSERT INTO `persons`(name_,surname,email,age,sex,height) VALUES
	('Juan','Arce','JaAR44@gmail.com',19,'Male',1.75),
	('Melisa','Guzman','MeLL64@gmail.com',20,'Female',1.6),
	('Ellie','Miller','MiEL999@hotmail.com',14,'Female',1.57),
	('Kevin','Arcilla','ARK54a@gmail.com',17,'Male',1.7),
	('Leo','Espinoza','LeO4E@gmail.com',24,'Male',1.74),
	('Marta','Gusto','Marti55@gmail.com',26,'Female',1.78),
	('Sol','Gonzales','SGla82@gmail.com',19,'Female',1.65),
	('Alan','Pacheco','AlLL49@gmail.com',16,'Male',1.64),
	('Agustin','Garcia','kev12GA@gmail.com',21,'Male',1.71);
/*!40000 ALTER TABLE `persons` ENABLE KEYS */;
-- UNLOCK TABLES;

--
-- Dumping events for database 'prueba2'
--

--
-- Dumping routines for database 'prueba2'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-07 15:50:31
