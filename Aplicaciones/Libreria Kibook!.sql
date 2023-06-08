-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: libreria
-- ------------------------------------------------------
-- Server version	8.0.32

CREATE DATABASE libreria;
USE libreria;
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
-- Table structure for table `libros`
--

-- DROP TABLE IF EXISTS `libros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `libros` (
  `id` int NOT NULL AUTO_INCREMENT,
  `autor` varchar(250) NOT NULL,
  `titulo` varchar(250) NOT NULL,
  `categoria` varchar(250) NOT NULL,
  `precio` double NOT NULL,
  `cantidad` int NOT NULL,
  `numPag` int NOT NULL,
  `fecha_de_publicacion` date NOT NULL,
  `restar` int NOT NULL,
  PRIMARY KEY (`id`)
);
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `libros`
--

SELECT*FROM libros;
-- LOCK TABLES `libros` WRITE;
/*!40000 ALTER TABLE `libros` DISABLE KEYS */;
INSERT INTO `libros`(autor,titulo,categoria,precio,cantidad,numPag,fecha_de_publicacion,restar) VALUES
	('H.P Lovecraft','The Call of the Cthulhu','Misterio',69.99,5,153,'2021-10-05',0),
	('H.P Lovecraft','The Cats of Ulthar','Misterio',55.63,3,169,'2021-12-05',0),
	('H.P Lovecraft','The Necronomicon','Misterio',151.99,10,200,'2021-10-05',0),
	('Friedrich Nietzsche','Beyond Good and Evil','Filosofia',99.99,15,269,'2021-04-04',0),
	('Friedrich Nietzsche','God is Dead','Filosofia',80.99,12,171,'2021-05-21',0),
	('Friedrich Nietzsche','So Speak Zaratustra','Filosofia',76.99,23,200,'2021-09-05',0),
	('Friedrich Nietzsche','The Antichrist','Filosofia',132.99,17,187,'2021-10-05',0),
	('Brandon Sanderson','The Empire Final','Fantasia',162.99,20,268,'2021-06-24',0),
	('Brandon Sanderson','The Road of the Kings','Fantasia',180.99,9,350,'2021-11-06',0),
	('Brandon Sanderson','White Sand','Fantasia',140.99,3,300,'2021-02-05',0),
	('Edgar Allan Poe','The Raven','Poesia',15.99,26,40,'2021-10-07',0),
	('Edgar Allan Poe','The Black Cat','Poesia',69.99,20,16,'2021-12-07',0),
	('Edgar Allan Poe','Annabel Lee','Poesia',18.99,19,30,'2021-07-19',0),
	('Stephen King','It','Horror/Triller',199.99,14,405,'2021-12-04',0),
	('Stephen King','The Cementery of the Animals','Horror',183.99,18,369,'2021-04-26',0),
	('Stephen King','Cujo','Horror',150.99,7,293,'2021-06-04',0),
	('J.R.R. Tolkien','The Fall of the Gondolin','Fantasia',210.99,2,354,'2021-03-08',0),
	('J.R.R. Tolkien','The Sir of the Rings','Fantasia',260.99,7,400,'2021-08-21',0),
	('J.R.R. Tolkien','The Hobbit','Fantasia/Accion',234.99,9,468,'2021-07-15',0),
	('Stephen Hawking','The Grand Design','Filosofia',140.99,8,210,'2021-09-05',0),
	('Dante Alighieri','Divine Comedy','Poesia Epica',207.99,13,300,'2021-02-06',0),
	('Frank Herbert','Dune','Ciencia Ficcion',277.99,6,430,'2021-09-08',0),
	('George R.R Martin','Game of Thrones','Accion',290.99,14,420,'2021-10-09',0),
	('Arthur Conan Doyle','Scarlet Study','Misterio',80.99,5,150,'2021-10-05',0),
	('Nicolas Maquiavelo','The Prince','Filosofia',105.99,7,200,'2021-11-25',0),
	('Albert Einstein','Theory About Relativity','Ciencia',150.99,6,236,'2021-01-20',0),
	('J.R.R Tolkien','The Songs of the Hurin','Fantasia',195.88,1,392,'2021-07-09',0);
/*!40000 ALTER TABLE `libros` ENABLE KEYS */;
-- UNLOCK TABLES;

--
-- Dumping events for database 'libreria'
--

--
-- Dumping routines for database 'libreria'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-07 15:44:48
