package me.zhangwenbo;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

//这里用了@SpringCloudApplication注解，之前没有提过，通过源码我们看到，
//它整合了@SpringBootApplication、@EnableDiscoveryClient、
//@EnableCircuitBreaker，主要目的还是简化配置

/*推荐使用serviceId的映射方式，除了对Zuul维护上更加友好之外，serviceId映射方式还支持了断路器，
对于服务故障的情况下，可以有效的防止故障蔓延到服务网关上而影响整个系统的对外服务*/

/*
 * 总结一下为什么服务网关是微服务架构的重要部分，是我们必须要去做的原因：

不仅仅实现了路由功能来屏蔽诸多服务细节，更实现了服务级别、均衡负载的路由。
实现了接口权限校验与微服务业务逻辑的解耦。通过服务网关中的过滤器，在各生命周期中去校验请求的内容，
将原本在对外服务层做的校验前移，保证了微服务的无状态性，同时降低了微服务的测试难度，
s让服务本身更集中关注业务逻辑的处理。
实现了断路器，不会因为具体微服务的故障而导致服务网关的阻塞，依然可以对外服务。
 * 
 * 
 */
@EnableZuulProxy
@SpringCloudApplication
public class ZuulApiGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApiGateWayApplication.class, args);
	}
	//在实现了自定义过滤器之后，还需要实例化该过滤器才能生效，我们只需要在应用主类中增加如下内容：
/*	@Bean
	public AccessFilter accessFilter() {
		return new AccessFilter();
	}*/
}
