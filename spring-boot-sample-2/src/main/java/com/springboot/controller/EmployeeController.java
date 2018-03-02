package com.springboot.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.entity.Employee;

/**
* @author zzq
* @create 2018年2月28日
*/
@Controller
@RequestMapping("employee")
public class EmployeeController {
	//@Autowired
	//private EmployeeService employeeService;
	
	private List<Employee> employees;
	
	@RequestMapping("employee_list/{id}")
	public String employeeList(@PathVariable("depid") Integer depid, Model model) {
		//employees = employeeService.findByDepId(depid);
		model.addAttribute("employeeList", employees);
		return "people/employee_list";
	}

}
