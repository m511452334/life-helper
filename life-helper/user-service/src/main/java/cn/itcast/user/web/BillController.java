package cn.itcast.user.web;

import cn.itcast.user.pojo.BaseResponse;
import cn.itcast.user.pojo.BillItem;
import cn.itcast.user.pojo.User;
import cn.itcast.user.response.BillResponse;
import cn.itcast.user.service.BillService;
import cn.itcast.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/bill")
public class BillController {

    @Autowired
    private BillService billService;

    /**
     * 路径： /queryBillList/1
     *
     * @param userId 用户id
     * @return 账单响应类
     */
    @GetMapping("/queryBillList/{userId}")
    public BillResponse queryBillByUserId(@PathVariable("userId") String userId) {
        BillResponse billResponse = new BillResponse();
        List<BillItem> billItems = billService.queryBillByUserId(userId);
        billResponse.setBillItemList(billItems);
        return billResponse;
    }

    @PostMapping("/create")
    public BaseResponse createBill(@RequestBody BillItem billItem) {
        int count = billService.createBill(billItem);
        return count > 0 ? new BaseResponse() : new BaseResponse("100000", "新增失败");
    }
}
