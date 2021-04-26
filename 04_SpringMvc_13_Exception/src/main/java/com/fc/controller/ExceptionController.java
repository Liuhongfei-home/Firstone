package com.fc.controller;

import com.fc.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class ExceptionController {

    @RequestMapping("myException")
    @ResponseBody
    public void testMyException(){
        System.out.println("自定义异常发生了。。。。");


        throw new MyException("自定义异常发生了。。。");
    }


    @RequestMapping("systemException")
    public void testSystemException() {
        int num = 1 / 0;

        System.out.println("系统异常发生了...");
    }

}
