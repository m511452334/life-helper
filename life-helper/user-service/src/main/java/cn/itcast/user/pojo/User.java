package cn.itcast.user.pojo;

import lombok.Data;

@Data
public class User {
    /**
    用户id
     */
    private Long userId;
    private String nickName;
    private String userName;
    private String password;
    private String createTime;
    private String updateTime;
    private String gender;
    private int age;
}