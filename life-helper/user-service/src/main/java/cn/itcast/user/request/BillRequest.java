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
    private String startTime;
    private String endTime;
    private String mode;
    private int start;
    private int limit;
}
