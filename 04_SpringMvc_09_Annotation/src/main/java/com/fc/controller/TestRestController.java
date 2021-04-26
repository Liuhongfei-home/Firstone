package com.fc.controller;

import com.fc.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("restController")
public class TestRestController {
    @RequestMapping("show")
    public User show(Integer age){

        User user = new User();
        if (age>16){
            user.setName("沈腾");
            user.setAge(60);
            user.setGender(false);
        }else {
            user.setName("刘亦菲");
            user.setAge(18);
            user.setGender(true);
        }

        return user;
    }
}
