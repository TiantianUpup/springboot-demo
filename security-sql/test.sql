-- MySQL dump 10.13  Distrib 5.7.23, for Win32 (AMD64)
--
-- Host: localhost    Database: test
-- ------------------------------------------------------
-- Server version	5.7.23-log

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

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `deleted` tinyint(255) NOT NULL DEFAULT '0',
  `gmt_create` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `gmt_modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `role` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'aa','aaa',0,'2019-08-05 01:19:10','2019-08-30 03:36:01','/test'),(2,'bb','bb',0,'2019-08-05 01:19:35','2019-08-30 03:36:01','/admin'),(3,'cc','$2a$10$8hL691YwI7CBpm28WYiyouIj7FjMQerxB99WdTG7ZQ.egfRx2sj6m',0,'2019-08-05 01:19:46','2019-09-05 02:30:59','/test'),(4,'dd','dd',0,'2019-08-05 01:20:53','2019-08-30 03:36:01','/test'),(7,'ff','$2a$10$L8Vyvi5qSPLsM611MDiq/OAvVgiTOVJmGHxVr6uslwQ6GIdjjLeWO',0,'2019-08-05 01:21:17','2019-09-05 01:27:32','/admin'),(8,'ff','$2a$10$L8Vyvi5qSPLsM611MDiq/OAvVgiTOVJmGHxVr6uslwQ6GIdjjLeWO',1,'2019-08-13 03:00:00','2019-09-05 01:27:32','/test'),(9,'ff','$2a$10$L8Vyvi5qSPLsM611MDiq/OAvVgiTOVJmGHxVr6uslwQ6GIdjjLeWO',0,'2019-08-13 03:00:00','2019-09-05 02:34:25','/guest'),(10,'cc','$2a$10$8hL691YwI7CBpm28WYiyouIj7FjMQerxB99WdTG7ZQ.egfRx2sj6m',0,'2019-08-05 01:19:46','2019-09-05 02:34:25','/guest');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-09-05 10:42:16