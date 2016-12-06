package me.zhangwenbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class UserMServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserMServiceApplication.class, args);
	}
}
