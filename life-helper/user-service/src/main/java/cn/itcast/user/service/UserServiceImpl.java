package cn.itcast.user.service;

import cn.itcast.user.mapper.UserMapper;
import cn.itcast.user.pojo.BaseResponse;
import cn.itcast.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryById(Long userId) {
        return userMapper.findById(userId);
    }

    public boolean createUser(User user) {
        try {
            userMapper.createUser(user);
        } catch (Exception ex) {
            return false;
        }
        return true;
    }

    public BaseResponse deleteUser(User user) {
        user.setStatus(0);
        userMapper.updateUser(user);
        return new BaseResponse();
    }
    public BaseResponse updateUser(User user) {
        userMapper.updateUser(user);
        return new BaseResponse();
    }
}