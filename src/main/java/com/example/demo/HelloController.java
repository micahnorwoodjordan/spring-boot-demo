package com.example.demo;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.stereotype.Controller;

// utilizing the `Controller` from the stereotype package to dynamically serve templates
// import org.springframework.web.bind.annotation.RestController;



@Controller
public class HelloController {

	@GetMapping("/")
	public String index(
		@RequestParam(name = "fname", required = false, defaultValue = "first name") String fname,
		@RequestParam(name = "lname", required = false, defaultValue = "last name") String lname,
		Model model
	) {
		model.addAttribute("fname", fname);
		model.addAttribute("lname", lname);
		return "index";
	}
}
