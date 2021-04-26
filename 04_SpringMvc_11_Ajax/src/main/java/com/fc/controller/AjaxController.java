package com.fc.controller;

import com.fc.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("test")
public class AjaxController {

    @RequestMapping("getRequest")
    public Map<String ,Object> getRequest(User user){
        System.out.println(user);

        Map<String, Object> map = new HashMap<>();

        map.put("code",200);
        map.put("success",true);
        map.put("message","请求成功");
        map.put("data",new User("秦始皇","123",1,"打钱"));



        try {
            System.out.println("相当于你喜欢的女生去洗澡");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return map;
    }
}
