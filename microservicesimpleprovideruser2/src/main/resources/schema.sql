CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `username` varchar(40) DEFAULT '',
  `name` varchar(20) DEFAULT '',
  `age` int(3) DEFAULT '0',
  `balance` decimal(10,2) DEFAULT '0.00',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;