package com.huang.example;

import brave.sampler.Sampler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@RestController
public class ServerHiApplcication {

    public static void main(String[] args) {
        SpringApplication.run(ServerHiApplcication.class,args);
    }

     static final Logger log = LoggerFactory.getLogger(ServerHiApplcication.class);

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @GetMapping("/hi")
    public String callHome(){
        log.info("calling trace service-hi");
        return restTemplate.getForObject("http://localhost:8768/miya",String.class);
    }

    @GetMapping("/info")
    public String info() {
        log.info("calling trace servece-hi2");
        return "i am service-hi";
    }

    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
}
