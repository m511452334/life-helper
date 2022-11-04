package cn.itcast.user.web;

import cn.itcast.user.config.PatternProperties;
import cn.itcast.user.pojo.BaseResponse;
import cn.itcast.user.pojo.User;
import cn.itcast.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
@RestController
@RequestMapping("/user")
// @RefreshScope
public class UserController {

    @Autowired
    private UserService userService;

    // @Value("${pattern.dateformat}")
    // private String dateformat;

    @Autowired
    private PatternProperties properties;

    @GetMapping("prop")
    public PatternProperties properties() {
        return properties;
    }

    @GetMapping("now")
    public String now() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(properties.getDateformat()));
    }

    /**
     * 路径： /user/110
     *
     * @param userId 用户id
     * @return 用户
     */
    @GetMapping("/{userId}")
    public User queryById(@PathVariable("userId") Long userId,
                          @RequestHeader(value = "Truth", required = false) String truth) {
        System.out.println("truth: " + truth);
         User user = userService.queryById(userId);
        return user;
    }

    @PostMapping("/create")
    public BaseResponse createUser(@RequestBody User user) {
        if (userService.createUser(user)) {
            return new BaseResponse();
        } else {
            return new BaseResponse("100000", "新增失败");
        }
    }

    @PostMapping("/delete")
    public BaseResponse deleteUser(@RequestBody User user) {
        return userService.deleteUser(user);
    }

    @PostMapping("/update")
    public BaseResponse updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }
}
