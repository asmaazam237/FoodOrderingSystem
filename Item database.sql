-- MySQL dump 10.13  Distrib 8.0.41, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: item
-- ------------------------------------------------------
-- Server version	8.0.41

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
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `Username` varchar(48) NOT NULL,
  `Password` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES ('saniya','1234'),('hammad','1234'),('alifya','1234'),('asma','1234'),('aliza','1234');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cart` (
  `id` int NOT NULL AUTO_INCREMENT,
  `itemname` varchar(100) NOT NULL,
  `prize` decimal(10,2) NOT NULL,
  `quantity` int NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  UNIQUE KEY `unique_item` (`itemname`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart`
--

LOCK TABLES `cart` WRITE;
/*!40000 ALTER TABLE `cart` DISABLE KEYS */;
/*!40000 ALTER TABLE `cart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fooditems`
--

DROP TABLE IF EXISTS `fooditems`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fooditems` (
  `id` int NOT NULL AUTO_INCREMENT,
  `itemname` varchar(100) DEFAULT NULL,
  `prize` decimal(6,2) DEFAULT NULL,
  `description` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fooditems`
--

LOCK TABLES `fooditems` WRITE;
/*!40000 ALTER TABLE `fooditems` DISABLE KEYS */;
INSERT INTO `fooditems` VALUES (1,'Coca-Cola',80.00,'Chilled soft drink'),(2,'Fresh Lime Soda',120.00,'Refreshing soda with lime'),(3,'Mango Smoothie',200.00,'Thick mango blend with yogurt'),(4,'Cold Coffee',220.00,'Chilled coffee with milk and sugar'),(5,'Orange Juice',180.00,'Freshly squeezed orange juice'),(6,'Chicken Tikka',350.00,'Spicy grilled chicken pieces'),(7,'Beef Seekh Kebab',400.00,'Minced beef skewers'),(8,'Grilled Lamb Chops',700.00,'Juicy lamb chops grilled to perfection'),(9,'BBQ Chicken Wings',320.00,'Marinated and grilled chicken wings'),(10,'Zinger Burger',380.00,'Spicy crispy chicken burger'),(11,'Chicken Shawarma',300.00,'Marinated chicken in pita bread'),(12,'Cheese Fries',250.00,'French fries topped with melted cheese'),(13,'Club Sandwich',400.00,'Triple layered sandwich with chicken and egg'),(14,'Chicken Roll',200.00,'Roll filled with sauce'),(15,'Egg Fried Rice',320.00,'Rice stir-fried with egg and vegetables'),(16,'Hot & Sour Soup',280.00,'Spicy and tangy soup'),(17,'Margherita Pizza',600.00,'Classic pizza with cheese and tomato'),(18,'Spaghetti Bolognese',650.00,'Pasta with minced meat sauce'),(19,'Lasagna',700.00,'Layered pasta with meat and cheese'),(20,'Chocolate Cake',300.00,'Moist chocolate sponge with frosting'),(21,'Gulab Jamun',120.00,'Deep-fried milk balls in syrup'),(22,'Ice Cream Sundae',350.00,'Ice cream with toppings'),(23,'Fruit Trifle',250.00,'Layered dessert with fruits and cream'),(24,'Cheesecake',400.00,'Creamy cheese dessert with biscuit base'),(25,'Kheer',150.00,'Rice pudding with milk and nuts'),(26,'Brownie with Ice Cream',400.00,'Chocolate brownie served with ice cream'),(27,'Custard',180.00,'Sweet vanilla custard'),(28,'Chicken Nuggets',250.00,'Breaded and fried chicken bites'),(29,'Spring Rolls',200.00,'Vegetable stuffed crispy rolls'),(30,'Garlic Bread',180.00,'Toasted bread with garlic butter'),(31,'Crispy Fried Prawns',550.00,'Deep-fried prawns with a crispy coating'),(32,'Potato Wedges',230.00,'Spiced deep-fried potato slices'),(33,'Chowmen ',370.00,'Filled with taste');
/*!40000 ALTER TABLE `fooditems` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ordercheckout`
--

DROP TABLE IF EXISTS `ordercheckout`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ordercheckout` (
  `itemname` varchar(100) NOT NULL,
  `prize` double NOT NULL,
  `quantity` double NOT NULL,
  `totalprice` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ordercheckout`
--

LOCK TABLES `ordercheckout` WRITE;
/*!40000 ALTER TABLE `ordercheckout` DISABLE KEYS */;
/*!40000 ALTER TABLE `ordercheckout` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-05-31 13:41:34
