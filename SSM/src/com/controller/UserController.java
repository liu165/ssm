package com.controller;

import java.util.HashMap;
import java.util.Map;

import javax.json.JsonObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.User;
import com.service.imp.UserServiceimp;

/**
 * 测试版本，简单的用户登入功能测试
 * @author me
 *
 */
public class UserController {
	@Autowired
	private UserServiceimp userimpServiceimp;
	@RequestMapping("/login")
	public @ResponseBody Map<String,String> login(String username,String password){
		System.out.println("1");
		User user = new User();
		user.setPassword(password);
		user.setUsername(username);
		User check = userimpServiceimp.check(user);
		if(check!=null){
			Map <String,String>map = new HashMap();
			map.put("success", "1");
			return map;
		}else{
			Map <String,String>map = new HashMap();
			map.put("false", "-1");
			return map;
		}
		
	}
	@RequestMapping("/test")
	public void test(){
		System.out.println("111");
	}
}
