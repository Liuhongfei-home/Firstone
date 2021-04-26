package com.fc.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fc.bean.Person;
import com.fc.bean.User;
import org.junit.Test;


import java.text.SimpleDateFormat;
import java.util.*;

public class JacksonTest {
    //将java对象转化为json对象
    @Test
    public void testJavaObjectToJsonObject(){
        //准备java对象
        Person person = new Person("李现",26,false);

        //创建jackson的核心对象
        ObjectMapper mapper = new ObjectMapper();

        try {
            String jsonStr = mapper.writeValueAsString(person);

            System.out.println(jsonStr);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testJavaCollectionToJasonObject(){

        //准备一个person类型的集合

        List<Person> peoples = new ArrayList<>();

        peoples.add(new Person("野原新之助",5,false));
        peoples.add(new Person("小白",3,false));
        peoples.add(new Person("小葵",2,false));

        //获取jackson核心类对象
        ObjectMapper mapper = new ObjectMapper();

        try {
            //将java对象转为jason字符串
            String jasonStr = mapper.writeValueAsString(peoples);

            System.out.println(jasonStr);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testJavaMapToJsonStr(){
        //准备一个Map
        Map<String, Person> map = new HashMap<>();

        map.put("person1",new Person("钢铁侠",50,false));
        map.put("person2",new Person("美国队长",150,false));
        map.put("person3",new Person("雷神",2050,false));


        ObjectMapper mapper = new ObjectMapper();


        try {
            //将java中的map转为json字符串
            String jsonStr = mapper.writeValueAsString(map);

            System.out.println(jsonStr);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }


    //将json字符串转为java对象
    @Test
    public void testJsonStrToJavaObject(){
        //准备一个json字符串
        String jsonStr = "{\"name\":\"雷神\",\"age\":2050,\"gender\":false}";

        ObjectMapper mapper = new ObjectMapper();

        try {
            Person person = mapper.readValue(jsonStr, Person.class);

            System.out.println(person.getName());
            System.out.println(person.getAge());
            System.out.println(person.isGender());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }



    @Test
    public void testDate(){
        //一起冠希，我是陈哈皮

        User user = new User("陈冠希",20,new Date(), false);

        Date date = new Date();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String format = simpleDateFormat.format(date);

        System.out.println(format);

        ObjectMapper mapper = new ObjectMapper();

        try {
            String jsonStr = mapper.writeValueAsString(user);

            System.out.println(jsonStr);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


    }






}
