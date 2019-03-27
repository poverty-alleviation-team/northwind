package com.strive.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Karl.Zhang
 * @ClassName ApiApplication
 * @Date 2019/3/23 14:26
 * @Description API项目启动类
 */
@SpringBootApplication(scanBasePackages = ("com.strive"))
public class ApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }
}
