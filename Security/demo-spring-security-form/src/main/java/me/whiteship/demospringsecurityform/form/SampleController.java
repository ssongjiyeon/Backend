package me.whiteship.demospringsecurityform.form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("message", "hello spring security"); // 키-밸류값으로 모델 값 설정 이 값을 index페이지에서 참조
		
		return "index";
	}
}
