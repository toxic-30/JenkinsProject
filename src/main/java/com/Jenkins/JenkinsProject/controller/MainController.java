package com.Jenkins.JenkinsProject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController 
{
	@RequestMapping("/")
	public static String message()
	{
		return("Good Morning");
	}

}
