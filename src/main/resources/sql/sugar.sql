/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.1.62-community : Database - sugar
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`sugar` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `sugar`;

/*Table structure for table `dict` */

DROP TABLE IF EXISTS `dict`;

CREATE TABLE `dict` (
  `id` int(32) NOT NULL,
  `dict_type` varchar(50) DEFAULT NULL,
  `dict_name` varchar(50) DEFAULT NULL,
  `dict_code` varchar(50) DEFAULT NULL,
  `order` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `dict` */

insert  into `dict`(`id`,`dict_type`,`dict_name`,`dict_code`,`order`) values (1,'sugarType','空腹血糖','fasting_sugar',1),(2,'sugarType','早餐后血糖','breakfast_sugar',2),(3,'sugarType','午餐后血糖','lunch_sugar',3),(4,'sugarType','晚餐后血糖','dinner_sugar',4);

/*Table structure for table `pub_users` */

DROP TABLE IF EXISTS `pub_users`;

CREATE TABLE `pub_users` (
  `USER_ID` varchar(30) NOT NULL,
  `USER_TYPE_CODE` varchar(10) DEFAULT NULL,
  `USER_NAME` varchar(30) NOT NULL,
  `PASSWORD` varchar(128) NOT NULL,
  `ACCOUNT_STATUS` char(2) NOT NULL DEFAULT '11',
  `IS_SYS` char(1) NOT NULL DEFAULT '0',
  `CREATE_TIME` char(17) NOT NULL,
  `LOCK_TIME` char(17) DEFAULT NULL,
  `EXPIRED_TIME` char(17) DEFAULT NULL,
  `PWD_UPT_TIME` char(17) DEFAULT NULL,
  `PWD_TIME` char(17) DEFAULT NULL,
  `ID_NUM` int(11) DEFAULT NULL,
  PRIMARY KEY (`USER_ID`),
  KEY `PUBUSERS_FK2` (`USER_TYPE_CODE`),
  CONSTRAINT `PUBUSERS_FK2` FOREIGN KEY (`USER_TYPE_CODE`) REFERENCES `pub_user_type` (`USER_TYPE_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `pub_users` */

insert  into `pub_users`(`USER_ID`,`USER_TYPE_CODE`,`USER_NAME`,`PASSWORD`,`ACCOUNT_STATUS`,`IS_SYS`,`CREATE_TIME`,`LOCK_TIME`,`EXPIRED_TIME`,`PWD_UPT_TIME`,`PWD_TIME`,`ID_NUM`) values ('DEMO','00','demo','61de73dbbd7a2bfc22edb0a1d12198f3','11','0','20151222',NULL,NULL,NULL,NULL,NULL),('PUBLIC','00','PUBLIC','99c6b157085564b43b85711360ec6166','11','0','20100120',NULL,NULL,NULL,NULL,NULL),('SUPERADMIN','00','SUPERADMIN','99c6b157085564b43b85711360ec6166','11','1','20100120',NULL,NULL,NULL,NULL,NULL),('SYSADMIN','00','SYSADMIN','99c6b157085564b43b85711360ec6166','11','1','20100120',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `sugar` */

DROP TABLE IF EXISTS `sugar`;

CREATE TABLE `sugar` (
  `id` int(32) NOT NULL,
  `sugar_data` double DEFAULT NULL,
  `sugar_type` varchar(50) DEFAULT NULL,
  `sugar_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `user_id` int(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sugar` */

insert  into `sugar`(`id`,`sugar_data`,`sugar_type`,`sugar_date`,`user_id`) values (1,8.5,'fasting_sugar','2017-12-06 20:10:04',123456),(2,8.1,'fasting_sugar','2017-12-10 20:10:06',123456),(3,9.2,'fasting_sugar','2017-12-10 20:10:30',666666),(4,7.9,'fasting_sugar','2017-12-14 20:10:08',123456),(5,10.9,'breakfast_sugar','2017-12-06 20:11:48',123456),(6,11.5,'breakfast_sugar','2017-12-10 20:11:49',123456),(7,10.7,'breakfast_sugar','2017-12-10 20:11:50',666666),(8,11.9,'breakfast_sugar','2017-12-14 20:11:07',123456),(9,12.5,'lunch_sugar','2017-12-06 20:12:01',123456),(10,13.1,'lunch_sugar','2017-12-10 20:12:01',123456),(11,12.7,'lunch_sugar','2017-12-10 20:12:02',666666),(12,11.8,'lunch_sugar','2017-12-14 20:12:03',123456),(13,11.5,'dinner_sugar','2017-12-06 20:11:24',123456),(14,12.3,'dinner_sugar','2017-12-10 20:12:12',123456),(15,13.2,'dinner_sugar','2017-12-10 20:12:12',666666),(16,12.6,'dinner_sugar','2017-12-14 20:11:39',123456);

/*Table structure for table `sugar_full` */

DROP TABLE IF EXISTS `sugar_full`;

CREATE TABLE `sugar_full` (
  `id` int(32) NOT NULL,
  `fasting_sugar` double DEFAULT NULL,
  `breakfast_sugar` double DEFAULT NULL,
  `lunch_sugar` double DEFAULT NULL,
  `dinner_sugar` double DEFAULT NULL,
  `sugar_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `user_id` int(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sugar_full` */

insert  into `sugar_full`(`id`,`fasting_sugar`,`breakfast_sugar`,`lunch_sugar`,`dinner_sugar`,`sugar_date`,`user_id`) values (1,8.9,11.1,10.8,10.5,'2017-12-07 12:41:50',123456),(2,7.8,12.5,11.8,10.9,'2017-12-10 12:41:53',123456),(3,8.1,10.7,9.8,10.5,'2017-12-16 16:56:13',123456),(4,7,10.1,9.8,9.9,'2017-12-10 16:56:17',123456),(5,9.9,12.2,13.3,11.9,'2017-12-10 17:02:54',789321);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
