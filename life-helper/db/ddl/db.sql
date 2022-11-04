CREATE TABLE `t_user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nick_name` varchar(20) DEFAULT '' COMMENT '昵称',
  `user_name` varchar(20) NOT NULL COMMENT '用户名',
  `password` varchar(255) NOT NULL COMMENT '密码',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `age` int(10) DEFAULT NULL COMMENT '年龄',
  `gender` varchar(255) DEFAULT NULL COMMENT '性别',
  `status` int(10) DEFAULT NULL COMMENT '1正常 0注销',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='用户表';

CREATE TABLE `t_bill_item` (
   `bill_id` varchar(20) NOT NULL COMMENT '账单id',
   `user_id` bigint(20) NOT NULL COMMENT '用户id',
   `bill_name` varchar(20) DEFAULT '' COMMENT '账单名称',
   `bill_type` varchar(20) NOT NULL COMMENT '账单类型',
   `create_time` datetime DEFAULT NULL COMMENT '创建时间',
   `update_time` datetime DEFAULT NULL COMMENT '更新时间',
   `money` int(10) DEFAULT NULL COMMENT '金额',
   `unit` varchar(255) DEFAULT NULL COMMENT '单位',
   PRIMARY KEY (`bill_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='账单表';