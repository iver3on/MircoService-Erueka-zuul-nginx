package me.zhangwenbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
///@EnableCircuitBreaker注解开启断路器功能：
@EnableCircuitBreaker

/*验证断路器的回调
依次启动eureka-server、compute-service、eureka-ribbon工程
访问http://localhost:1111/可以看到注册中心的状态
访问http://localhost:3333/add，页面显示：30
关闭compute-service服务后再访问http://localhost:3333/add，页面显示：error
*/public class ConsumerClientApplication {
	
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}


	public static void main(String[] args) {
		SpringApplication.run(ConsumerClientApplication.class, args);
	}
}
