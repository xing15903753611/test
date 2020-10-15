package com.example.mybatisplussecurity.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisplussecurity.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 创建人
 * @since 2020-06-02
 */
@Service
public interface UserService extends IService<User> {
    public Page<User> getAllUser();

    void saveUser(MultipartFile file);

    void exportUser();
}
