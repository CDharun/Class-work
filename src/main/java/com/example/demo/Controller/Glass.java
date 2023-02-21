package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Glass 
{
	@RequestMapping("/")
  public String rat() 
{
	return "hahahahaha";
}
	@RequestMapping("/a")
	public String cow()
	{
		return "mmmmmmmm";
	}
}
