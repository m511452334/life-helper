package cn.itcast.user.service;

import cn.itcast.user.mapper.BillMapper;
import cn.itcast.user.mapper.UserMapper;
import cn.itcast.user.pojo.BaseResponse;
import cn.itcast.user.pojo.BillItem;
import cn.itcast.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BillServiceImpl implements BillService {

    @Autowired
    private BillMapper billMapper;


    @Override
    public List<BillItem> queryBillByUserId(String userId) {
        return billMapper.queryBillByUserId(userId);
    }

    @Override
    public int createBill(BillItem billItem) {
        billItem.setBillId(UUID.randomUUID().toString());
        return billMapper.createBill(billItem);
    }
}