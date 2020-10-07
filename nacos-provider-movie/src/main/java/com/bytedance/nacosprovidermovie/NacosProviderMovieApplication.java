package com.bytedance.nacosprovidermovie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class NacosProviderMovieApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosProviderMovieApplication.class, args);
    }

}
