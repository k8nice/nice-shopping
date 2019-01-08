package com.nice;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author nice
 */
@SpringBootApplication
@EnableDubboConfig
@DubboComponentScan
public class CmsCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmsCustomerApplication.class,args);
    }
}
