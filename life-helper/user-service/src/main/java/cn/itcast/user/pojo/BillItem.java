package cn.itcast.user.pojo;

import lombok.Data;

@Data
public class BillItem {
    /**
    用户id
     */
    private String billId;
    private String userId;
    private String billName;
    private String billType;
    private String createTime;
    private String updateTime;
    private String money;
    private String unit;
}