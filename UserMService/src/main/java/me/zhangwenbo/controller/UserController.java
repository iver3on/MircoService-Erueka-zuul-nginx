package me.zhangwenbo.controller;
import org.slf4j.Logger;  
import org.slf4j.LoggerFactory;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import me.zhangwenbo.service.UserService;

/**
@author  iver3on 
@date 创建时间：2016年12月5日 上午11:20:11 * 
@version 1.0 * 
 */
@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	UserService userService;
	 private static Logger Log = LoggerFactory.getLogger(UserController.class);
	// 登录
		@RequestMapping(value = "login", method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
		@ResponseBody
		public String login(@RequestBody String loginInfo) {
			return userService.login(loginInfo);
		}

		
		// 注册
		@RequestMapping(value = "register", method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
		@ResponseBody
		public String register(@RequestBody String info) {
			Log.info(info);
			String result = userService.register(info);
			return result;
		}

}
