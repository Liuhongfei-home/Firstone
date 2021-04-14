package com.fc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    //测试字符串直接跳转页面
    @RequestMapping
    public String testStringPath() {
        System.out.println("通过字符串直接跳转页面");

        return "/index.html";
    }
}
