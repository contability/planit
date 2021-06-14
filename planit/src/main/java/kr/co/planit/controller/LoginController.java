package kr.co.planit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
//	@Resource
//	private PlnUserService plnUserService;
	
	@RequestMapping(value = "/portal.go", method = RequestMethod.GET)
	public String loginPage() {
		System.out.println("anwlagnwanglni");
		return "portal";
	}
}
