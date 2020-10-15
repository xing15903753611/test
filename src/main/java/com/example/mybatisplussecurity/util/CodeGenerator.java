package com.example.mybatisplussecurity.util;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;

/**
 * @Author 邢方辉
 * @Date 2020/6/2 8:36
 * @Version 1.0
 * @Content mybatis-plus-generator
 */
public class CodeGenerator {
    @Test
    public void run(){
        //1、创建代码生成器
        AutoGenerator mpg = new AutoGenerator();
        //2、全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir("D:\\workspace\\SpirngCloudIntegrate\\mybatis-plus-security" + "/src/main/java");
        gc.setAuthor("创建人");
        gc.setOpen(false);//生成后是打开资源管理
        gc.setFileOverride(false);//重新生成时文件是否覆盖

        //UserService
        gc.setServiceName("%sService");//去掉Service接口的首字母I
        gc.setIdType(IdType.ID_WORKER_STR);//主键生成策略
        gc.setDateType(DateType.ONLY_DATE);//定义生成的实体类中日期类型
        gc.setSwagger2(true);//开启Swagger2模式

        mpg.setGlobalConfig(gc);

        //3、数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
            dsc.setUrl("jdbc:mysql://localhost:3306/school?serverTimezone=UTC&rewriteBatchedStatements=true");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        dsc.setDbType(DbType.MYSQL);
        mpg.setDataSource(dsc);

        //4、包配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName("");//也就是初始化到哪个包目录下
        //包  comatguigu.eduservice
        pc.setParent("");//
        //包  com.atguigu.eduservice.com.example.mybatisplussecurity.controller
        pc.setController("com.example.mybatisplussecurity.controller");
        pc.setEntity("com.example.mybatisplussecurity.entity");
        pc.setService("com.example.mybatisplussecurity.service");
        pc.setMapper("com.example.mybatisplussecurity.mapper");
        pc.setXml("com.example.mybatisplussecurity.mapper.xml");
        mpg.setPackageInfo(pc);

        //5、策略配置
        StrategyConfig strategyConfig = new StrategyConfig();

        strategyConfig.setInclude("s_user");//表名

        strategyConfig.setNaming(NamingStrategy.underline_to_camel);//数据库表映射到实体的命名策略
        strategyConfig.setTablePrefix(pc.getModuleName() + "s_");//生成实体类时候去掉前缀比如去掉s_user 前缀s_

        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);//数据库表字段映射到实体类的命名
        strategyConfig.setEntityLombokModel(true);//lombok 模型

        strategyConfig.setRestControllerStyle(true);//resultful 风格控制器
        strategyConfig.setControllerMappingHyphenStyle(true);//url中驼峰转连字符

        mpg.setStrategy(strategyConfig);

        //6 执行
        mpg.execute();
    }
}
