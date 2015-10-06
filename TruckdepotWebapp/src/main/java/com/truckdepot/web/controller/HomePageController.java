package com.truckdepot.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomePageController {
	@RequestMapping(value = "/home")
	public String homePage(HttpServletRequest request, HttpServletResponse response, Model model) {
		System.out.println("home page called");
		return "home";

	}
}
