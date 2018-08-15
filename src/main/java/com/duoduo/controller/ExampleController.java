package com.duoduo.controller;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.duoduo.dao.UserDao;
import com.duoduo.dao.entity.User;
import com.duoduo.dao.entity.UserExample;
import com.duoduo.service.UserService;
import com.tiantian.util.security.AES;
@Controller
@RequestMapping("/example")
public class ExampleController {
	@Resource UserDao userDao;
	@Autowired UserService userService;
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
		User user2 = userService.getUser(new Integer(1));
		System.out.println(JSON.toJSON(user));
		String str = JSON.toJSON(user2).toString();
		 return str;
	}
	@RequestMapping(value="list",method=RequestMethod.GET)
	@ResponseBody()
	public String list(){
		UserExample example = new UserExample();
		
		ArrayList<User> userList =  (ArrayList<User>) userDao.selectByExample(example);
		System.out.println(JSON.toJSON(userList));
		String str = JSON.toJSON(userList).toString();
		 return str;
	}
	@RequestMapping(value="add",method=RequestMethod.GET)
	@ResponseBody()
	public String add(){
		User record = new User();
		record.setAge(19);
		record.setUserName("张三");
		record.setPassword("zhangsan");
		int res =  userDao.insert(record);
		System.out.println(JSON.toJSON(res));
		String str = JSON.toJSON(res).toString();
		return str;
	}
	public void descMsg() throws Exception
    {
    	String src = "VF+YPgPkVJ234vKBCUxPxA==";
    	String key = "4B103DF3D3505AF871EFED63A78E3B75";
    	byte[] mobile = AES.decrypt(src.getBytes(), key);
        System.out.println(new String(mobile));
    }
}
