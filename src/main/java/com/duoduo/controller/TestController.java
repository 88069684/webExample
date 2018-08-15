package com.duoduo.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping("/test")
public class TestController {
	@RequestMapping(value = "testurl", method = RequestMethod.GET)
	public String testUrlRedirect(HttpServletRequest req, HttpServletResponse resp) throws IOException{
//		return "test";
		String url = "redirect:http://baidu.com/downloadRequestElecCont.action?contNo="; 
		return url;
//		resp.sendRedirect(url);
//        return new ModelAndView(url);  
	}
}
