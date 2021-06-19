package kr.co.planit.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.planit.service.PlnUserService;

@Controller
public class LoginController {
	
	@Resource
	private PlnUserService plnUserService;
	
	@RequestMapping(value = "/portal.go", method = RequestMethod.GET)
	public String loginPage() {
		
		return "portal";
	}
	
	@RequestMapping(value = "/userList.go", method = RequestMethod.GET)
	public String plnUserList(Model model) {
		
		model.addAttribute("rows", plnUserService.list());
		
		return "/manage/user/userList";
	}
	
}
