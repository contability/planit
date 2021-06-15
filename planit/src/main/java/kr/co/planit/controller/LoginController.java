package kr.co.planit.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.planit.service.PlnUserService;

@Controller
public class LoginController {
	
	@Resource
	private PlnUserService plnUserService;
	
	@RequestMapping(value = "/portal.go", method = RequestMethod.GET)
	public String loginPage() {
		System.out.println("\n\n\n\n\n\n anwlagnwanglni");
		return "portal";
	}
	
	@RequestMapping("/test.go")
	public String test() {
		System.out.println("\n\n\n\n\n\n success....");
		
		return "";
	}
}
