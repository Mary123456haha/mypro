package com.neuedu.springmvc10.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class UserController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//需要返回一个ModelAndView对象那么我么遵命
		ModelAndView mav=new ModelAndView();
		//给跳转页面传递数据
		mav.addObject("message", "hello world");
		//设置跳转页面
		mav.setViewName("main");//前缀+main+后缀：/WEB-INF/main.jsp
		mav.setViewName("1");
		mav.setViewName("2");
		return mav;
	}

}
