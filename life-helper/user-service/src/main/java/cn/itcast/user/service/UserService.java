package cn.itcast.user.service;

import cn.itcast.user.pojo.BaseResponse;
import cn.itcast.user.pojo.User;

/**
 * @author lichengming
 * @date 2022/11/4 -0:06
 */
public interface UserService {
    /**
     * 用户登录
     * @param user 用户id
     * @return 用户信息
     */
    BaseResponse login(User user);
    /**
     * 根据id查询用户
     * @param userId 用户id
     * @return 用户信息
     */
    User queryById(String userId);

    /**
     * 创建用户信息
     * @param user 用户信息
     * @return 状态
     */
    boolean createUser(User user);

    /**
     * 逻辑删除用户
     * @param user 用户id
     * @return 响应基类
     */
    BaseResponse deleteUser(User user);

    /**
     * 更新用户用户
     * @param user 用户
     * @return 响应基类
     */
    BaseResponse updateUser(User user);
}
