package com.xhh.company;

import com.xhh.common.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

/**
 * @description
 * @author: weiXhh
 * @create: 2020-04-15 14:21
 **/
//scanBasePackages = "com.xhh.company"可省略
@SpringBootApplication(scanBasePackages = "com.xhh.company")
// 启动jpa注解扫描
@EntityScan(value = "com.xhh.domain.company")
public class CompanyApplication {
    public static void main(String[] args) {
        SpringApplication.run(CompanyApplication.class, args);
    }

    @Bean
    public IdWorker idWorker(){
        return new IdWorker();
    }
}
