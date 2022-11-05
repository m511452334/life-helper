package cn.itcast.user.service;

import cn.itcast.user.pojo.BillItem;
import cn.itcast.user.request.BillRequest;
import cn.itcast.user.response.BillResponse;

import java.util.List;

/**
 * @author lichengming
 * @date 2022/11/4 -0:06
 */
public interface BillService {
    /**
     * 根据id查询用户
     * @param billRequest 用户id
     * @return 用户信息
     */
    BillResponse queryBillByUserId(BillRequest billRequest);

    int createBill(BillItem userId);
}
