package cn.itcast.user.pojo;

import lombok.Data;

/**
 * @author lichengming
 * @date 2022/11/3 -23:07
 */
@Data
public class BaseResponse {
    private String resultCode;
    private String resultMessage;

    public BaseResponse() {
        this.resultCode = "000000";
        this.resultMessage = "success";
    }

    public BaseResponse(String resultCode, String resultMessage) {
        this.resultCode = resultCode;
        this.resultMessage = resultMessage;
    }
}
