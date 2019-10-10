package com.cg.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {

	@RequestMapping("/greet.do")
	public String sayHello(Map<String, String> model) {
		model.put("message", "Welcome to Improved MVC");
		return "greeting";
	}
	
	@RequestMapping("/bye.do")
	public String sayBye(Map<String, String> model) {
		model.put("message", "BYE , see you soon");
		return "greeting";
	}
	
	

}
