-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: schoolmanagmentsystem
-- ------------------------------------------------------
-- Server version	8.0.20

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
  `id` int NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Father name` varchar(45) NOT NULL,
  `phone` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (1,'Admin','123','Muhamamd Tahir','Shamsuddin','03069430816','khairpur','mtm75474@gmail.com');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `Name` varchar(45) NOT NULL,
  `FatherName` varchar(45) NOT NULL,
  `Caste` varchar(45) NOT NULL,
  `Religion` varchar(45) NOT NULL,
  `Gender` varchar(45) NOT NULL,
  `DOB` varchar(45) NOT NULL,
  `Work` varchar(45) NOT NULL,
  `Grade` varchar(45) NOT NULL,
  `phone` varchar(45) NOT NULL,
  `salary` varchar(45) NOT NULL,
  `PlaceofBirth` varchar(45) NOT NULL,
  `PCNIC` varchar(45) NOT NULL,
  `Nationality` varchar(45) NOT NULL,
  `Address` varchar(45) NOT NULL,
  `id` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES ('Murid Ali','irshad','shaikh','islam','Male','1996-07-17','Poen','8','0365892356','15000','khairpur','452036598561','Pakistani','Khairpur, Sindh','1001'),('Papan','imran','lakho','huduism','Male','2020-07-08','Security Guard','6','03569865321','8000','Sukkur','458756521325','Pakistani','Sukkur, Sindh, Khairpur','1003');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `remaimber_data`
--

DROP TABLE IF EXISTS `remaimber_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `remaimber_data` (
  `id` int NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `remaimber_data`
--

LOCK TABLES `remaimber_data` WRITE;
/*!40000 ALTER TABLE `remaimber_data` DISABLE KEYS */;
INSERT INTO `remaimber_data` VALUES (1,'suraksha','123456'),(2,'Admin','123');
/*!40000 ALTER TABLE `remaimber_data` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `students` (
  `RollNumber` int NOT NULL,
  `Name` varchar(45) NOT NULL,
  `FatherName` varchar(45) NOT NULL,
  `Caste` varchar(45) NOT NULL,
  `Gender` varchar(45) NOT NULL,
  `Religion` varchar(45) NOT NULL,
  `Class` int NOT NULL,
  `Address` varchar(200) NOT NULL,
  `GuardianContact` varchar(45) NOT NULL,
  `GuardianCNIC` varchar(45) NOT NULL,
  `PlaceOfBirth` varchar(45) NOT NULL,
  `Nationality` varchar(45) NOT NULL,
  `LastSchool` varchar(45) NOT NULL,
  `DateOfBirth` varchar(45) NOT NULL,
  `Username` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  PRIMARY KEY (`RollNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students`
--

LOCK TABLES `students` WRITE;
/*!40000 ALTER TABLE `students` DISABLE KEYS */;
INSERT INTO `students` VALUES (100,'Muhammad Tahir','Shamsuddin Memon','Memon','Male','Islam',7,'Civic center khairpur','03069430816','452034621547','khairpur','Pakistani','FRESH','1999-03-06','tahirmemon','1234567'),(102,'Muhammad Tahir soomro','Ghafoor Ali','sommro','Male','islam',2,'Rohri, sukkur, Sindh, Pakistan','03065489321','4521389653217','Rohri, sukkur','Pakistani','Fresh','2020-01-13','tahir123','tahir'),(103,'Suraksha','Salman','Diwan','Female','hinduism',5,'Sukkur, Sindh, Pakistan','036589754665','4512365981235','Sukkur','Pakistani','Fresh','2020-06-28','suraksha','123456'),(104,'Shafeeq Akhtar','Akhtar Ali','Narajo','Male','Islam',7,'Gambat, Sindh','034598653214','4530154658975','Gambat','Pakistani','Fresh','2001-07-11','shafiqakhtar','shafiq'),(105,'Komal','Saifullah','Shaikh','Female','islam',7,'khairpur, sindh','03256598658','2520345652317','khairpur','Pakistani','Fresh','2000-07-04','komal12','komal'),(106,'Ghafoor','Irshad Ali','Soomro','Male','islam',5,'Ghabat, Sindh, pakistan.','034598652134','452036598651','Gambat','Pakistani','Sindh children','1996-07-11','ghafoor','ghafoor'),(107,'Areej Atta','Janiad Ali','ghumro','Female','islam',7,'Khairpur, Sindh, Pakistan','03069865231','4516254982315','khairpur','pakistani','Pak Turk School','2000-06-14','areejatta','areej');
/*!40000 ALTER TABLE `students` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teacher` (
  `Name` varchar(45) NOT NULL,
  `FatherName` varchar(45) NOT NULL,
  `Caste` varchar(45) NOT NULL,
  `Religion` varchar(45) NOT NULL,
  `Subject` varchar(45) NOT NULL,
  `Gender` varchar(45) NOT NULL,
  `DOB` varchar(45) NOT NULL,
  `phone` varchar(45) NOT NULL,
  `Salary` varchar(45) NOT NULL,
  `Grade` varchar(45) NOT NULL,
  `PlaceofBirth` varchar(45) NOT NULL,
  `PCNIC` varchar(45) NOT NULL,
  `Nationality` varchar(45) NOT NULL,
  `Address` varchar(45) NOT NULL,
  `Username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `id` varchar(45) NOT NULL,
  `SubjectKey` varchar(45) NOT NULL,
  PRIMARY KEY (`Username`,`id`,`SubjectKey`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher`
--

LOCK TABLES `teacher` WRITE;
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
INSERT INTO `teacher` VALUES ('Sher Ahmed','Muhamamd Yasir Ali','Doulphoto','Islam','Object oriented programming','Male','1979-07-19','03069735816','110000','19','Ghambat, sindh','4520398456321','Pakistani','Gambat, sindh','ahmedsher','sherahmed','1002','4001'),('Khalid Hussain','Amjad','Shaikh','Islam','English','Male','2020-07-23','03459865321','50000','18','sukkur','4521365981475','Pakistani','Sukkur, Sindh','hussainkhalid','khalidhussain','1003','4002'),('Irum Sindhu','Mushtak Ali','Memon','Islam','ICT','Female','1987-07-16','035687652135','88000','18','Khairpur','4520396524568','Pakistani','Khairpur, Sindh','irumsindhu','irum','1007','4007'),('Muhammad Atif','Rehman','Memon','Islam','Programming','Male','2020-07-14','03156455645','70000','17','sukkur','4521256488975','Pakistani','sukkur, sindh','memonatif','atifmemon','1004','4005'),('Nawaz Ali','Sudheer ','Baloch','Islam','English','Male','1990-07-10','03659856554','35000','16','Rohri','4530254569875','Pakistani','Rohri, Sukkur, Sindh','nawazahmed','ahmednawaz','1001','4004'),('samar','khalid ','talpur','islam','usrdu','Male','2003-03-04','036598213','50000','18','sukur','5232659878','pakistani','sukkur sindh pakistan','sammar','1234568','1010','4009'),('Sanam','Murad Ali','Syed','Islam','ICT','Female','1993-07-07','0345549865','80000','17','Sukkur','45085549854623','Pakistani','Sukkur, sindh','sanam12','sanam','1005','4006');
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-07-22 20:23:09
