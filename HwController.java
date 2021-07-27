package com.example.familia28.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello" )
public class HwController {
	
	@GetMapping
	public String hallo() {
		return "Hello Gen, essa atividade me fez usar muito a orientação ao futuro e"
				+      " principalmente a minha persistência";
				
				
	}

}
