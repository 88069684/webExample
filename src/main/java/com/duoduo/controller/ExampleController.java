package com.duoduo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.duoduo.dao.UserDao;
import com.duoduo.dao.entity.User;

@Controller
@RequestMapping("/example")
public class ExampleController {
	@Resource UserDao userDao;
	@RequestMapping(value="index",method=RequestMethod.GET)
	public String  index(){
		User user =  userDao.selectByPrimaryKey(new Integer(1));
		System.out.println(JSON.toJSON(user));
		System.out.println(user.getPassword());
		return "example";
	}
	@RequestMapping(value="json",method=RequestMethod.GET)
	@ResponseBody()
	public String json(){
		User user =  userDao.selectByPrimaryKey(new Integer(1));
		System.out.println(JSON.toJSON(user));
		String str = JSON.toJSON(user).toString();
		 return str;
	}
}
