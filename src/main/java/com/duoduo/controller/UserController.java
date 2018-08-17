package com.duoduo.controller;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.duoduo.dao.UserDao;
import com.duoduo.dao.entity.User;
import com.duoduo.dao.entity.UserExample;
import com.duoduo.service.UserService;
import com.tiantian.util.security.AES;
@Controller
@RequestMapping("/user")
public class UserController {
	@Resource UserDao userDao;
	@Autowired UserService userService;
	@RequestMapping(value="index",method=RequestMethod.GET)
	public String  index(){
		User user =  userDao.selectByPrimaryKey(new Integer(1));
		System.out.println(JSON.toJSON(user));
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
	@RequestMapping(value="add",method=RequestMethod.POST)
	@ResponseBody()
	public String add(@RequestParam("username") String userName,@RequestParam("password") String password, @RequestParam("age") Integer age,HttpServletRequest request){
		User record = new User();
		record.setAge(age);
		record.setUserName(userName);
		record.setPassword(password);
		System.out.println("单独获取：："+request.getParameter("username"));
		
		int res =  userDao.insert(record);
		System.out.println(JSON.toJSON(res));
		String str = JSON.toJSON(res).toString();
		return str;
	}
	@RequestMapping(value="descmsg",method=RequestMethod.GET)
	@ResponseBody()
	public String descMsg() throws Exception
    {
    	String src = "VF+YPgPkVJ234vKBCUxPxA==";
    	String key = "4B103DF3D3505AF871EFED63A78E3B75";
    	byte[] mobile = AES.decrypt(src.getBytes(), key);
    	String mo = new String(mobile);
        System.out.println(mo);
        return mo.toString();
    }
}
