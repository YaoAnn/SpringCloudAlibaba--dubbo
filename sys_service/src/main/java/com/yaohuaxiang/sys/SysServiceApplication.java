package com.yaohuaxiang.sys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author yaohuaxiang
 * @create 2021/4/1 - 9:08
 */

@SpringBootApplication
@ComponentScan(basePackages = {"com.yaohuaxiang.common.handler","com.yaohuaxiang.sys"} )
@EnableDiscoveryClient
public class SysServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SysServiceApplication.class, args);
    }
}
