package com.fc.controller;

import com.fc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("testDateFormat")
    public String testDateFormat(User user){

        System.out.println(user);

        return "/index.jsp";
    }

//    @RequestMapping("test")
//    public String testDateFormat(Date date) {
//        System.out.println(date);
//
//        return "/index.jsp";
//    }

}
