CREATE TABLE `t_user` (
      `id` bigint(20) NOT NULL AUTO_INCREMENT,
      `nick_name` varchar(20) DEFAULT '' COMMENT '昵称',
      `user_name` varchar(20) NOT NULL COMMENT '用户名',
      `password` varchar(255) NOT NULL COMMENT '密码',
      `create_time` datetime DEFAULT NULL COMMENT '创建时间',
      `update_time` datetime DEFAULT NULL COMMENT '更新时间',
      `age` int(10) DEFAULT NULL COMMENT '年龄',
      `gender` varchar(255) DEFAULT NULL COMMENT '性别',
      PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '用户表';
