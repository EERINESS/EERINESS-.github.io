package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.entity.Department;
import com.springboot.service.DepartmentService;

/**
* @author zzq
* @create 2018年2月28日
*/
@Controller
@RequestMapping("department")
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	
	private List<Department> departments;
	private Department department;
	
	@RequestMapping("department_list")
	public String departmentList(Model model) {
		departments = departmentService.findAll();
		model.addAttribute("departments", departments);
		return "people/department_list";
	}
	
	@RequestMapping("department_add")
	public String toDepartmentAdd() {
		return "people/department_add";
	}
	
	@RequestMapping("departmentAdd")
	public String departmentAdd(Department department) {
		departmentService.saveDepartment(department);
		return "redirect:/department/department_list";
	}
	
	@RequestMapping("department_update/{depid}")
	public String toDepartmentUpdate(@PathVariable("depid") Integer depid, Model model) {
		department = departmentService.getById(depid);
		model.addAttribute("department", department);
		return "people/department_update";
	}
	
	@RequestMapping("departmentUpdate")
	public String departmentUpdate(Department department) {
		departmentService.saveDepartment(department);
		return "redirect:/department/department_list";
	}
	
	@RequestMapping("departmentDelete/{depid}")
	public String departmentDelete(@PathVariable("depid") Integer depid) {
		departmentService.deleteDepartment(depid);
		return "redirect:/department/department_list";
	}
	
	@RequestMapping("departmentDeleteBatch")
	public String departmentDeleteBatch(Integer[] ids) {
		for (Integer depid : ids) {
			departmentService.deleteDepartment(depid);
		}
		return "redirect:/department/department_list";
	}
	
	@RequestMapping("dep_emp/{depid}")
	public String depEmp(@PathVariable("depid") Integer depid, Model model) {
		department = departmentService.getById(depid);
		model.addAttribute("department", department);
		return "people/dep_emp";
	}

}
