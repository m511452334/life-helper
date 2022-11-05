package cn.itcast.user.request;

import lombok.Data;

/**
 * @author lichengming
 * @date 2022/11/5 -15:08
 */
@Data
public class BillRequest {
    private String userId;
    private String billName;
    private String billType;
    private String createTime;
    private String updateTime;
    private String mode;
}
