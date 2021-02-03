package com.luo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = "com.luo")
@MapperScan("com.luo.mapper")

public class Springboot1000Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot1000Application.class, args);
    }

}
