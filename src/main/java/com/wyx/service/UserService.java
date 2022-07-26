package com.wyx.service;

import com.wyx.pojo.User;

import java.util.List;

public interface UserService {

    List<User> selectUserPage(String user_name, String user_sex,int startRow);

    int createUser(User user);

    int deleteUserById(String user_id);

    int getRowCount(String user_name,String user_sex);
}
