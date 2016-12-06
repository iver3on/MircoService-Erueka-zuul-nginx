package me.zhangwenbo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import me.zhangwenbo.controller.UserController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMServiceApplicationTests {

	@Autowired
	UserController userController;
	@Test
	public void contextLoads() {
	}

	@Test
	public void login(){
		String s = "{\"username\":\"zwb\",\"password\":\"123456\"}";
		String result =  userController.login(s);
		System.out.println(result);
	}
}
