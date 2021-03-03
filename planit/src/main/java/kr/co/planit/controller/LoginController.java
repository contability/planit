package kr.co.planit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/portal.go")
	public String loginPage() {
		return "portal";
	}
	
}
