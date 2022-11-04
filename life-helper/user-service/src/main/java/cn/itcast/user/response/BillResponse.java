package cn.itcast.user.response;

import cn.itcast.user.pojo.BaseResponse;
import cn.itcast.user.pojo.BillItem;
import lombok.Data;

import java.util.List;

/**
 * 响应基类
 *
 * @author lichengming
 * @date 2022/11/4 -21:55
 */
@Data
public class BillResponse extends BaseResponse {
    private List<BillItem> billItemList;
    private int total;
}
