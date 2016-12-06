package me.zhangwenbo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import me.zhangwenbo.service.ComputeService;

@RestController
public class ConsumerController {
  /*  @Autowired
    RestTemplate restTemplate;*/
	@Autowired
    private ComputeService computeService;
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        //return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=20", String.class).getBody();
    	//提供rest接口的Controller改为调用ComputeService的addService
    	return computeService.addService();
    }
}