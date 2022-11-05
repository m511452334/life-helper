package cn.itcast.user.service;

import cn.itcast.user.mapper.BillMapper;
import cn.itcast.user.mapper.UserMapper;
import cn.itcast.user.pojo.BaseResponse;
import cn.itcast.user.pojo.BillItem;
import cn.itcast.user.pojo.User;
import cn.itcast.user.request.BillRequest;
import cn.itcast.user.response.BillResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BillServiceImpl implements BillService {

    @Autowired
    private BillMapper billMapper;


    @Override
    public BillResponse queryBillByUserId(BillRequest billRequest) {
        BillResponse billResponse = new BillResponse();
        List<BillItem> billItems = billMapper.queryBillByUserId(billRequest);
        billResponse.setBillItemList(billItems);
        billResponse.setTotal(billMapper.queryBillCount(billRequest));
        return billResponse;
    }

    @Override
    public int createBill(BillItem billItem) {
        billItem.setBillId(UUID.randomUUID().toString());
        return billMapper.createBill(billItem);
    }
}