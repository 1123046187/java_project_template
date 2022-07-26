package com.wyx.mapper;

import com.wyx.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    //用户表查询分页功能的实现

    List<User> selectUserPage(
            @Param("userName")
            String userName,
            @Param("userSex")
            String userSex,
            @Param("startRow")  //算好分页起始行地址
            int startRow
    );

    //增加用户
    int createUser(User user);

    //删除用户
    int deleteUserById(
            @Param("userId")
            String userId
    );

    //获取总行数，显示一共展示多少页
    int getRowCount(
            @Param("userName")
            String userName,
            @Param("userSex")
            String userSex);
}
