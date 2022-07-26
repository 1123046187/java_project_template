package com.wyx.service.Impl;


import com.wyx.mapper.UserMapper;
import com.wyx.pojo.User;
import com.wyx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;


    @Override
    public List<User> selectUserPage(String user_name, String user_sex, int startRow) {
        return userMapper.selectUserPage(user_name,user_sex,startRow);
    }

    @Override
    public int createUser(User user) {
        return userMapper.createUser(user);
    }

    @Override
    public int deleteUserById(String user_id) {
        return userMapper.deleteUserById(user_id);
    }

    @Override
    public int getRowCount(String user_name, String user_sex) {
        return userMapper.getRowCount(user_name,user_sex);
    }
}
