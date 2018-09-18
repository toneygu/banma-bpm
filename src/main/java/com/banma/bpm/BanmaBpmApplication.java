package com.banma.bpm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@MapperScan("com.banma.bpm.dao.mapper")
@EnableSwagger2
@SpringBootApplication
public class BanmaBpmApplication {

    public static void main(String[] args) {
        SpringApplication.run(BanmaBpmApplication.class, args);
    }
}
