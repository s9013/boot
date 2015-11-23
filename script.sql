CREATE database wind;

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;


INSERT INTO `user` VALUES (1,'java');
insert into user (name) values ('tom');
insert into user (name) values ('mike');
insert into user (name) values ('owen');
insert into user (name) values ('jack');
insert into user (name) values ('eddy');
insert into user (name) values ('jerry');
