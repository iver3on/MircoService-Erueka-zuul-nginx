package me.zhangwenbo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import me.zhangwenbo.bean.User;
import me.zhangwenbo.dao.UserDao;
import me.zhangwenbo.util.MarkResult;

/**
@author  iver3on 
@date 创建时间：2016年12月5日 上午11:41:55 * 
@version 1.0 * 
 */
@Service
public class UserService {
	
	@Autowired
	UserDao userDAO;
	/**
	 * @param loginInfo
	 * @return
	 */
	public String login(String loginInfo) {
		JSONObject obj = JSON.parseObject(loginInfo);
		String username = obj.getString("username");
		String password = obj.getString("password");
		if (isRight(username, password)) {
			return MarkResult.getResult(1, "成功");
		}
		return MarkResult.getResult(0, "用户名或者密码错误");
	}
	
	public String register(String info) {
		JSONObject obj = JSON.parseObject(info);
		String username = obj.getString("username");
		User user = new User();
		user.setName(username);
		user.setPassword(obj.getString("password"));
	/*	user.setNickname(obj.getString("nickname"));
		user.setPushtoken(obj.getString("pushtoken"));
		user.setProfilePhoto(AvatarUtil.getAvatarURL());
		user.setFocusCount(0);
		user.setIsFocusCount(0);
		user.setFriendsCount(0);*/
		userDAO.save(user);
		return MarkResult.getResult(1,"注册成功！");
	}

	// 此用户名是否存在
	public String isExits(String name) {
		if (userDAO.findByName(name).size() != 0)
			return "exits";
		else
			return "notExits";
	}


	
	/**
	 * @param username
	 * @param password
	 * @return
	 */
	private boolean isRight(String username, String password) {
		return userDAO.findByNameAndPassword(username, password).size()!=0;
	}
}
