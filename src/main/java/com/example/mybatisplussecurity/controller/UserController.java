package com.example.mybatisplussecurity.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisplussecurity.entity.User;
import com.example.mybatisplussecurity.service.UserService;
import com.example.mybatisplussecurity.util.RestResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 创建人
 * @since 2020-06-02
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService service;
    @RequestMapping(value="/add",method = {RequestMethod.POST})
    public RestResult addUser(){
        User user = new User();
        user.setUsername("xiaoming");
        user.setPassword("123");
        service.save(user);
        return RestResult.success("测试成功",null);
    }
    @RequestMapping(value="/delUser",method = {RequestMethod.GET})
    public RestResult delUser(@PathVariable("id") Integer id){
        service.removeById(id);
        return RestResult.fail("测试失败");
    }
    @RequestMapping(value="/findAllUser",method = {RequestMethod.GET})
    public RestResult findAllUser(){
        Page<User> page = new Page<>(1,3);
        System.out.println("22222222222222222");
        return RestResult.success("测试成功", service.getAllUser());
    }
    //导入Excel数据
    public RestResult addSubject(MultipartFile file){
        //上传过来的excel文件
        service.saveUser(file);
        return RestResult.success("测试成功", null);
    }
    //导出数据到Excel中
    public RestResult exportUser(){
        service.exportUser();
        return RestResult.success("测试成功", null);
    }
}

