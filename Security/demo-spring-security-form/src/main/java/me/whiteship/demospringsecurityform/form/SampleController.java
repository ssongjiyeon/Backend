package me.whiteship.demospringsecurityform.form;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {
	
	@GetMapping("/")
	public String index(Model model, Principal principal) {
		if(principal == null) {
			model.addAttribute("message", "hello spring security"); // 키-밸류값으로 모델 값 설정 이 값을 index페이지에서 참조
		} else {
			model.addAttribute("message", "hello index " + principal.getName());
		}
		
		return "index";
	}
	
	@GetMapping("/info")
	public String info(Model model) { // 아무나 접근 가능
		model.addAttribute("message", "Info"); 	
		
		return "info";
	}
	
	@GetMapping("/dashboard")
	public String dashboard(Model model, Principal principal) { // 인증된 사용자만 접근 가능
		model.addAttribute("message", "hello " + principal.getName()); 
		
		return "dashboard";
	}
	
	@GetMapping("/admin")
	public String admin(Model model, Principal principal) { // 인증된 사용자 + 역할이 admin인 사람만 접근 가능
		model.addAttribute("message", "hello admin " + principal.getName());
		
		return "admin";
	}
}
