package org.potwings.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class CommonController {

	@GetMapping("/customLogin")
	public void customLogin() {
		
	}
	
	@GetMapping("/accessError")
	public void errorPage(Authentication auth,Model model) {
		
		log.info("access Denied : " + auth);
		
		model.addAttribute("msg", "Access Fail");
	}
	
	@GetMapping("/customLogout")
	public void customLogout() {
		
	}
}
