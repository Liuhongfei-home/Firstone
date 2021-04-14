package com.fc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("testStaticResources")
    public String testStaticResources() {
        System.out.println("静态资源已放行");

        return "/WEB-INF/html/index.html";
    }
    @RequestMapping("testIndex")
    public String testIndex() {
        System.out.println("静态资源已放行");

        return "/WEB-INF/html/testStaticResources.html";
    }


}
