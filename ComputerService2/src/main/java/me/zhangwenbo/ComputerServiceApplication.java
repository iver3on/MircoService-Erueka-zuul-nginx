package me.zhangwenbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
//该注解能激活Eureka中的DiscoveryClient实现，才能实现Controller中对服务信息的输出。
@SpringBootApplication
public class ComputerServiceApplication {
//Could not locate PropertySource: I/O error on GET request for "http://localhost:8888/compute-service/dev": Connection refused: connect; nested exception is java.net.ConnectException: Connection refused: connect
	public static void main(String[] args) {
		SpringApplication.run(ComputerServiceApplication.class, args);
	}
}
