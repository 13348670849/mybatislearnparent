package com.enjoylearning.mybatis;

import com.alibaba.druid.pool.DruidDataSource;
import com.enjoylearning.mybatis.service.UserService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jmx.export.annotation.ManagedResource;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
@PropertySource(value = {"classpath:/db.properties"})
@ComponentScan(value = {"com.enjoylearning.mybatis.service"})
public class MainConfig {

   /* @Autowired
    Environment env;*/


    @Bean
    public DataSource dataSource( @Autowired Environment env){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(env.getProperty("jdbc_url"));
        dataSource.setUsername(env.getProperty("jdbc_username"));
        dataSource.setPassword(env.getProperty("jdbc_password"));
        dataSource.setDriverClassName(env.getProperty("jdbc_driver"));
        return dataSource;
    }

   @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
         SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
         sqlSessionFactoryBean.setDataSource(dataSource);
         sqlSessionFactoryBean.setTypeAliasesPackage("com.enjoylearning.mybatis.entity");
         ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
            sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/sqlmapper/*.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
         return sqlSessionFactoryBean;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.enjoylearning.mybatis.mapper");
        return  mapperScannerConfigurer;
    }


    public static void main(String[] args) {
        ApplicationContext a =
                new AnnotationConfigApplicationContext(MainConfig.class);
        for(String str : a.getBeanDefinitionNames()){
            System.out.println(str);
        }
        UserService userService = (UserService) a.getBean("userServiceImpl");
        System.out.println(userService.getUserById(1));
    }
}
