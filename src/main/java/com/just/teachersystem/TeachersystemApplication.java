package com.just.teachersystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableConfigurationProperties
@EnableTransactionManagement
@SpringBootApplication
@MapperScan("com.just.teachersystem.Mapper")
public class TeachersystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeachersystemApplication.class, args);
    }

}
