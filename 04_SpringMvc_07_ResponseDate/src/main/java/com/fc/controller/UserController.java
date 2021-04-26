package com.fc.controller;

import com.fc.bean.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@Controller
@RequestMapping("user")
public class UserController {

    //测试字符串直接跳转页面
    @RequestMapping("testStringPath")
    public String testStringPath() {

        System.out.println("通过字符串直接跳转页面");

        return "/index.html";
    }

    // 测试使用ModelAndView
    @RequestMapping("testModelAndViewByParams")
    // 注意，返回值类型要用ModelAndView
    public ModelAndView testModelAndViewByParams(ModelAndView mv) {

        // 设置属性键值对
        // 相当于 request(session，servletContext).setAttribute(String name, Object value)
        mv.addObject("obj1", "周杰伦的 ---> 听爸爸的话");
        mv.addObject("obj2", "周杰伦的 ---> 听妈妈的话");

        // 设置视图
        mv.setViewName("/success.jsp");

        return mv;
    }

    //返回值为void并且使用响应对象的重定向
    @RequestMapping("testVoidOnRedirect")
    public void testVoidOnRedirect(HttpServletResponse response) {

        System.out.println("void....");

        try {
            response.sendRedirect("/index.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //返回值为void并且使用响应对象的重定向
    @RequestMapping("testVoidOnForward")
    public void testVoidOnForward(HttpServletRequest request,
                                  HttpServletResponse response) {

        System.out.println("testVoidOnForward....");

        try {
            request.getRequestDispatcher("/index.html").forward(request, response);
        } catch (IOException | ServletException e) {
            e.printStackTrace();
        }
    }

    //通过字符串进行转发
    @RequestMapping("testForwardOnString")
    public String testForwardOnString() {

        System.out.println("通过字符串进行转发");


        return "forward:/index.html";
    }

    //通过字符串进行转发
    @RequestMapping("testRedirectOnString")
    public String testRedirectOnString() {

        System.out.println("通过字符串进行重定向");


        return "redirect:/index.html";
    }

    @RequestMapping("testResponseBody")
    @ResponseBody
    public void testResponseBody() {
        System.out.println("使用ResponseBody注解，就不会被视图解析器所处理");
    }

    // ResponseBody加上HttpServletResponse
    @RequestMapping("testResponseBodyAndHttpServletResponse")
    @ResponseBody
    public void testResponseBody(HttpServletResponse response) {
        System.out.println("使用ResponseBody注解，就不会被视图解析器所处理");

        response.setContentType("text/html; charset=UTF-8");

        String html = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>测试响应页面</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1 align=\"center\" style=\"color: red\">索河路与万山路交叉口向东200米：荥阳市第二小学(好吃)二十年老店</h1>\n" +
                "</body>\n" +
            "</html>";
            try {
                //自己写页面
                response.getWriter().append(html);
            } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 响应内容为json
    @RequestMapping("testJson")
    @ResponseBody
    public User testJson() {
        return new User("易烊千玺", 20, false, new Date());
    }

    // 测试响应内容为Map
    @RequestMapping("testMap")
    @ResponseBody
    public Map<String, Object> testMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 200);
        map.put("msg", "请求成功");

        Map<String, Object> data = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add("烤羊排");
        list.add("烤乳猪");
        list.add("烤全羊");
        list.add("烤鸽子");


        data.put("list", list);
        data.put("user", new User("泡泡枪", 1, false, new Date()));

        map.put("data", data);

        return map;
    }
}