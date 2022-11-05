package cn.itcast.user.mapper;

import cn.itcast.user.pojo.BillItem;
import cn.itcast.user.pojo.User;
import cn.itcast.user.request.BillRequest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BillMapper {

    List<BillItem> queryBillByUserId(BillRequest billRequest);

    int queryBillCount(BillRequest billRequest);

    int createBill(BillItem billItem);
}