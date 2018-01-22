package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author zzq
* @create 2018年1月22日
*/
@Controller
@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping("/lala")
	public String index() {
		return "index";
	}

}
