package com.cs.algo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/index")
public class Home {
	@RequestMapping(method = RequestMethod.GET)
	public String home() {
		return "home";
	}
}
