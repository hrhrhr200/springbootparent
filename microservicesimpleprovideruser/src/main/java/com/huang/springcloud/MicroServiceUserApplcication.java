package com.huang.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class MicroServiceUserApplcication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceUserApplcication.class,args);
    }

}
