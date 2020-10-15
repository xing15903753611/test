package com.example.mybatisplussecurity.util;
import lombok.Data;

/**
 * @Author 邢方辉
 * @Date 2020/6/2 9:29
 * @Version 1.0
 * @Content 创建一个java文本
 */
@Data
public class RestResult<T>{
    private String message;
    private Integer code;
    private T data;
    private RestResult(){
    }
    public static RestResult  success(String message,Object object){
        RestResult result=new RestResult();
        result.setCode(400);
        result.setMessage(message);
        result.setData(object);

        return result;
    }
    public static RestResult fail(String message){
        RestResult result = new RestResult();
        result.setCode(500);
        result.setMessage(message);
        return result;
    }
}
