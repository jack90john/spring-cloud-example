package com.jack90john.demo.service.first;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@EnableOAuth2Sso
@EnableFeignClients
@SpringCloudApplication
@EnableHystrixDashboard
public class DemoServiceFirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoServiceFirstApplication.class, args);
    }

}
