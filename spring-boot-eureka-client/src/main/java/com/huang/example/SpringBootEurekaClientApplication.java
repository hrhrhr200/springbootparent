package com.huang.example;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableDiscoveryClient
@EnableHystrix
@EnableHystrixDashboard
public class SpringBootEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaClientApplication.class, args);
	}

	@Value("${server.port}")
	private String port;

	@RequestMapping("/home")
	@HystrixCommand(fallbackMethod = "hiError")
	public String home(@RequestParam(value = "name",defaultValue = "xiaohuang")String name){
			return "hi"+name+",i am from port:"+port;
	}

	public String hiError(String name) {
		return "hi,"+name+",sorry,error!";
	}
}
