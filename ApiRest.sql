-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: portfolio
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `books`
--
CREATE DATABASE portfolio;
USE portfolio;
-- DROP TABLE IF EXISTS `books`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `books` (
  `id` int NOT NULL AUTO_INCREMENT,
  `author` varchar(250) NOT NULL,
  `title` varchar(250) NOT NULL,
  `num_pag` int NOT NULL,
  `price` double NOT NULL,
  `category` varchar(250) NOT NULL,
  `stock` int NOT NULL,
  `date_` date NOT NULL,
  PRIMARY KEY (`id`)
);
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `books`
--

SELECT*FROM books;
-- LOCK TABLES `books` WRITE;
/*!40000 ALTER TABLE `books` DISABLE KEYS */;
INSERT INTO `books`(author,title,num_pag,price,category,stock,date_) VALUES
	('H.P Lovecraft','The Call of the Cthulhu',153,69.99,'Misterio',5,'2021-10-05'),
	('H.P Lovecraft','The Cats of Ulthar',169,55.63,'Misterio',3,'2021-12-05'),
	('H.P Lovecraft','The Necronomicon',200,151.99,'Misterio',10,'2021-10-05'),
	('Friedrich Nietzsche','Beyond Good and Evil',269,99.99,'Filosofia',15,'2021-04-04'),
	('Friedrich Nietzsche','So Speak Zaratustra',200,76.99,'Filosofia',23,'2021-09-05'),
	('Friedrich Nietzsche','The Antichrist',187,132.99,'Filosofia',17,'2021-10-05'),
	('Brandon Sanderson','The Empire Final',268,162.99,'Fantasia',20,'2021-06-24'),
	('Brandon Sanderson','The Road of the Kings',350,180.99,'Fantasia',9,'2021-11-06'),
	('Brandon Sanderson','White Sand',300,140.99,'Fantasia',3,'2021-02-05'),
	('Edgar Allan Poe','The Raven',40,15.99,'Poesia',26,'2021-10-07'),
	('Edgar Allan Poe','The Black Cat',16,69.99,'Poesia',20,'2021-12-07'),
	('Edgar Allan Poe','Annabel Lee',30,18.99,'Poesia',19,'2021-07-19'),
	('Stephen King','It',405,199.99,'Horror',14,'2021-10-04'),
	('Stephen King','The Cementery of the Animals',369,183.99,'Horror',18,'2021-04-26'),
	('Stephen King','Cujo',293,150.99,'Horror',10,'2021-06-04'),
	('J.R.R. Tolkien','The Fall of the Gondolin',354,210.99,'Fantasia',2,'2021-03-08'),
	('J.R.R. Tolkien','The Sir of the Rings',400,260.99,'Fantasia',7,'2021-08-21'),
	('J.R.R. Tolkien','The Hobbit',468,234.99,'Fantasia',6,'2021-07-08'),
	('J.R.R. Tolkien','The Songs of the Hurin',392,195.99,'Fantasia',1,'2021-07-09'),
	('Stephen Hawking','The Grand Design',210,140.99,'Filosofia',8,'2021-09-05'),
	('Dante Alighieri','Divine Comedy',300,207.99,'Poesia Epica',13,'2021-02-06'),
	('Frank Herbert','Dune',430,277.99,'Ciencia Ficcion',6,'2021-09-08'),
	('George R.R Martin','Game of Thrones',420,290.99,'Accion',15,'2021-10-09'),
	('Arthur Conan Doyle','Scarlet Study',150,80.99,'Misterio',5,'2021-10-05'),
	('Nicolas Maquiavelo','The Prince',200,105.99,'Filosofia',7,'2021-11-25'),
	('Albert Einstein','Theory About Relativity',236,150.99,'Ciencia',6,'2021-01-20'),
	('Friedrich Nietzsche','s',11,9.2,'Videojuego',10,'2022-11-05');
/*!40000 ALTER TABLE `books` ENABLE KEYS */;
-- UNLOCK TABLES;

--
-- Dumping events for database 'portfolio'
--

--
-- Dumping routines for database 'portfolio'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-07 15:54:57
