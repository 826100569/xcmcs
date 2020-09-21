package com.xc.xcmcs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.xc.xcmcs.dao")
public class XcmcsApplication {

    public static void main(String[] args) {
        SpringApplication.run(XcmcsApplication.class, args);
    }

}
