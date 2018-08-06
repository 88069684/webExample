CREATE DATABASE `test` /*!40100 DEFAULT CHARACTER SET utf8 */ ;
use test;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(40) NOT NULL,
  `password` varchar(255) NOT NULL,
  `age` int(4) NOT NULL,
  `tiny_int` tinyint(1) DEFAULT NULL,
  `big_decimals` decimal(11,4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ;
insert into user set id=1,user_name='test',password='testpassword',age=18;