package com.example.mybatisplussecurity.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author 创建人
 * @since 2020-06-02
 */
@Data
public class User implements Serializable {
    //测试
    private static final long serialVersionUID = 1L;
    private Integer id;

    private String username;


    private String password;


    private String uemail;


    private String uphone;

    private String uaddress;

    private String createtime;

    private Boolean enable;


}
