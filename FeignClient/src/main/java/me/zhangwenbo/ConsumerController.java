package me.zhangwenbo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    ComputeClient computeClient;
    @RequestMapping(value = "login", method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
    public 	String login(@RequestBody String loginInfo) {
        return computeClient.login(loginInfo);
    }
}