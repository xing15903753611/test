package com.example.mybatisplussecurity.mapper;

import com.example.mybatisplussecurity.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 创建人
 * @since 2020-06-02
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
