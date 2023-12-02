package br.com.escola.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/")
public class home {

	@GetMapping
	public String home() {
		return "Home";
	}
	
}
