package kr.co.planit.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.planit.service.PlnUserService;

@Controller
public class LoginController {
	
	@Resource
	PlnUserService plnUserService;
	
	@RequestMapping(value = "/portal.go")
	public String loginPage() {
		return "portal";
	}
	
	@RequestMapping(value = "/test.go")
	public String test(Model model) {
		
		model.addAttribute("rows", plnUserService.list());
		
		return "test";
	}
	
	
	
}
