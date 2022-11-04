package cn.itcast.user.service;

import cn.itcast.user.pojo.BillItem;

import java.util.List;

/**
 * @author lichengming
 * @date 2022/11/4 -0:06
 */
public interface BillService {
    /**
     * 根据id查询用户
     * @param userId 用户id
     * @return 用户信息
     */
    List<BillItem> queryBillByUserId(String userId);

    int createBill(BillItem userId);
}
