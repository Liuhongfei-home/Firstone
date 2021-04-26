package com.fc.exception;

//自定义异常
public class MyException  extends RuntimeException{

    public MyException(){
        super();
    }
    public MyException(String message){
        super(message);
    }
}
