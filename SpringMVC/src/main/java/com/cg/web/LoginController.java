package com.cg.web;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.bean.LoginBean;

//@Controller
//public class LoginController {
//	@RequestMapping("/login.do")
//	public String validate(LoginBean login, Map model) {
////		model.put("message", "Login Successfull:"+ login.getUserid());
//		model.put("login", login);
//		return "output";
//		
//		
//		
//	}
@Controller
public class LoginController {

	// Access URL:http://localhost:8080/SpringMVC/login.do
	@RequestMapping(name = "/login.do", method = RequestMethod.POST)
	public String validate(LoginBean login, HttpSession session) {
//		model.put("message", "Login Successfull:"+ login.getUserid());
		session.setAttribute("login", login);
		return "output";
	}

	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}
}
