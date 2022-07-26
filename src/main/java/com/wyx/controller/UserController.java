package com.wyx.controller;


import com.wyx.pojo.User;
import com.wyx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //如果本类中全是ajax请求，则使用此注解，方法上的@ResponseBody可以不用写
@RequestMapping("/user")
public class UserController {

    public static final int PAGE_SIZE = 5;
    @Autowired
    UserService userService;


    @RequestMapping("/selectUserPage")
//    @ResponseBody
    public List<User> selectUserPage(String userName, String userSex,Integer page){
        //根据页码计算其实行
        int startRow = 0;
        if(page != null){
            startRow = (page-1)*PAGE_SIZE;
        }
        return userService.selectUserPage(userName,userSex,startRow);
    }

    @RequestMapping("/createUser")
//    @ResponseBody
    public int createUser(String cardType,String cardNo,String userName,String userSex,String UserAge,String userRole){
        /**
         *     private String user_id;
         *     private String card_type;
         *     private String card_no;
         *     private String user_name;
         *     private String user_sex;
         *     private String user_age;
         *     private String user_role;
         */
        String userId = System.currentTimeMillis()+"";
        return userService.createUser(new User(userId,cardType,cardNo,userName,userSex,UserAge,userRole));
    }

    @RequestMapping("/deleteUserById")
//    @ResponseBody
    public int deleteUserById(String userId){
        return userService.deleteUserById(userId);
    }


    @RequestMapping("/getRowCount")
//    @ResponseBody
    public int getRowCount(String userName, String userSex){
        return userService.getRowCount(userName,userSex);
    }
}
