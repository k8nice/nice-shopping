package com.nice;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author nice
 */
@SpringBootApplication
@EnableDubboConfig
@DubboComponentScan
@ComponentScan(basePackages = {"com.nice.service","com.nice.domain"})
@MapperScan("com.nice.mapper")
public class CmsProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmsProviderApplication.class,args);
    }
}
