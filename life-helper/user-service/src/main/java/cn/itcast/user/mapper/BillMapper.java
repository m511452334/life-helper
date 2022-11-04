package cn.itcast.user.mapper;

import cn.itcast.user.pojo.BillItem;
import cn.itcast.user.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BillMapper {

    List<BillItem> queryBillByUserId(@Param("userId") String userId);

    int createBill(BillItem billItem);
}