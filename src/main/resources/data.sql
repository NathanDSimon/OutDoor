DROP DATABASE if exists `outdoor`

CREATE DATABASE `outdoor` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */

CREATE TABLE outdoor.`locations` (
  `primary_location` bigint unsigned NOT NULL AUTO_INCREMENT,
  `Latitude` double NOT NULL,
  `Longitude` double NOT NULL,
  PRIMARY KEY (`primary_location`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

CREATE TABLE outdoor.`user` (
  `Username` varchar(12) NOT NULL,
  `email` varchar(24) NOT NULL,
  `address` varchar(50) NOT NULL,
  `DoB` date NOT NULL,
  `primary_location` bigint unsigned NOT NULL,
  `password` varchar(12) NOT NULL,
  PRIMARY KEY (`Username`),
  KEY `User_FK` (`primary_location`),
  CONSTRAINT `User_FK` FOREIGN KEY (`primary_location`) REFERENCES `locations` (`primary_location`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

CREATE TABLE outdoor.`user_link` (
  `Username` varchar(12) NOT NULL,
  `Linked_Username` varchar(12) NOT NULL,
  PRIMARY KEY (`Username`,`Linked_Username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci


INSERT INTO outdoor.locations (Latitude,Longitude) VALUES
	 (33.870414,-118.122507),
	 (37.654833,-122.380459),
	 (45.480677,-122.621889),
	 (49.263026,-123.14133),
	 (40.669527,-111.728339),
	 (39.5944,-105.099981),
	 (29.598932,-95.311082),
	 (41.967659,-87.7609),
	 (42.412643,-71.153424),
	 (40.502662,-74.534125),
	 (34.969999,-80.887651),
	 (26.168585,-80.697432),
	 (39.073219,-94.568699)
	 
INSERT INTO outdoor.`user` (`Username`,email,address,DoB,primary_location,password) VALUES
	 ('test_user_1','test_1@email.com','1','2000-01-01',1,1),
	 ('test_user_2','test_2@email.com','2','2000-01-01',2,2),
	 ('test_user_3','test_3@email.com','3','2000-01-01',3,3),
	 ('test_user_4','test_4@email.com','4','2000-01-01',4,4),
	 ('test_user_5','test_5@email.com','5','2000-01-01',5,5),
	 ('test_user_6','test_6@email.com','6','2000-01-01',6,6);
	 ('test_user_7','test_7@email.com','7','2000-01-01',7,7),
	 ('test_user_8','test_8@email.com','8','2000-01-01',8,8),
	 ('test_user_9','test_9@email.com','9','2000-01-01',9,9),
	 ('test_user_10','test_10@email.com','10','2000-01-01',10,10),
	 ('test_user_11','test_11@email.com','11','2000-01-01',11,11),
	 ('test_user_12','test_12@email.com','12','2000-01-01',12,12),
	 ('test_user_13','test_13@email.com','13','2000-01-01',13,13)
	 
INSERT INTO outdoor.user_link (Username,Linked_Username) VALUES
	 ('test_user_1','test_user_2'),
	 ('test_user_1','test_user_3'),
	 ('test_user_1','test_user_4'),
	 ('test_user_1','test_user_5'),
	 ('test_user_10','test_user_1'),
	 ('test_user_10','test_user_2'),
	 ('test_user_10','test_user_5'),
	 ('test_user_11','test_user_7'),
	 ('test_user_11','test_user_8'),
	 ('test_user_11','test_user_9'),
	 ('test_user_12','test_user_1'),
	 ('test_user_12','test_user_5'),
	 ('test_user_12','test_user_7'),
	 ('test_user_13','test_user_2'),
	 ('test_user_13','test_user_4'),
	 ('test_user_2','test_user_3'),
	 ('test_user_2','test_user_4'),
	 ('test_user_2','test_user_5'),
	 ('test_user_2','test_user_6'),
	 ('test_user_2','test_user_7'),
	 ('test_user_3','test_user_4'),
	 ('test_user_3','test_user_5'),
	 ('test_user_3','test_user_6'),
	 ('test_user_3','test_user_7'),
	 ('test_user_4','test_user_1'),
	 ('test_user_4','test_user_2'),
	 ('test_user_4','test_user_5'),
	 ('test_user_5','test_user_1'),
	 ('test_user_5','test_user_3'),
	 ('test_user_5','test_user_8'),
	 ('test_user_6','test_user_12'),
	 ('test_user_6','test_user_5'),
	 ('test_user_6','test_user_7'),
	 ('test_user_7','test_user_12'),
	 ('test_user_7','test_user_3'),
	 ('test_user_7','test_user_6'),
	 ('test_user_8','test_user_1'),
	 ('test_user_8','test_user_2'),
	 ('test_user_8','test_user_5'),
	 ('test_user_9','test_user_12'),
	 ('test_user_9','test_user_2'),
	 ('test_user_9','test_user_3')