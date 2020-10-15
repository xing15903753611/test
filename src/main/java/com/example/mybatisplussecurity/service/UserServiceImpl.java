package com.example.mybatisplussecurity.service;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisplussecurity.entity.User;
import com.example.mybatisplussecurity.mapper.UserMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.*;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 创建人
 * @since 2020-06-02
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Resource
    private UserMapper mapper;
    @Override
    public Page<User> getAllUser(){
        Page<User> page = new Page<>(1,3);
        return (Page<User>) mapper.selectPage(page,null);
    }

    @Override
    public void saveUser(MultipartFile file) {

    }

    @Override
    public void exportUser() {
        String filename = "";
        EasyExcel.write(filename,User.class).sheet("用户列表").doWrite(getAllUser().getRecords());
    }
}
