package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author zzq
* @create 2018年1月22日
*/
@Controller
public class HelloController {
	
	@RequestMapping(value= {"/","/index"})
	public String index() {
		System.out.println("jiji");
		return "index";
	}

}
