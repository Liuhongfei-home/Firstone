package com.fc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("annotation")
public class AnnotationController {

    @RequestMapping("testRequestParam")
    @ResponseBody
    // RequestParam用来进行参数的绑定
    // value对应前端传递过来的参数名
    // required:true代表必须携带此参数,false：不必须
    public void testRequestParam(@RequestParam(value = "id",required = true) Integer userId,
                                 @RequestParam(value = "name",required = false) String userName){
        System.out.println(userId);
        System.out.println(userName);
    }

    @RequestMapping("testPathVariable/{id}/{name}")
    public void testPathVarialble(@PathVariable("id") String id,
                                  @PathVariable("name") String name){

        System.out.println("更新："+id);
        System.out.println("更新："+name);

    }

    @PostMapping("testRestful/{id}")
    @ResponseBody
    public void testAdd(@PathVariable Integer id) {
        System.out.println("增：" + id);
    }

    @DeleteMapping("testRestful/{id}")
    @ResponseBody
    public void testDelete(@PathVariable Integer id) {
        System.out.println("删：" + id);
    }

    @PutMapping("testRestful/{id}")
    @ResponseBody
    public void testUpdate(@PathVariable Integer id) {
        System.out.println("改：" + id);
    }

    @GetMapping("testRestful/{id}")
    @ResponseBody
    public void testSelect(@PathVariable Integer id) {
        System.out.println("查：" + id);
    }

    // RequestBody用来获取前端传递的url中的参数部分
    // 用的很少，很容易报错
    // json对象转为java对象
    @RequestMapping("testRequestBody")
    @ResponseBody
    public void testRequestBody(@RequestBody(required = true) String context) {
        System.out.println(context);
    }




}
