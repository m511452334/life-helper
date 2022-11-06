package cn.itcast.user.pojo;

import lombok.Data;

@Data
public class User {
    /**
    用户id
     */
    private String userId;
    /**
     用户名
     */
    private String userName;
    /**
     密码
     */
    private String password;
    private String createTime;
    private String updateTime;
    /**
     性别
     */
    private String gender;
    private int age;
    private int status;
}