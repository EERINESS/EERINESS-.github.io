package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.entity.Husband;
import com.springboot.service.HusbandService;

/**
* @author zzq
* @create 2018年1月24日
*/
@Controller
@RequestMapping("people")
public class HusbandController {
	@Autowired
	private HusbandService husbandService;
/*	@Autowired
	private WifeRepository wifeRepository;*/
	private List<Husband> husbands;
	
	@RequestMapping("husband_list")
	public String husbandList(Model model) {
		husbands = husbandService.findAllHusband();
		model.addAttribute("husbands", husbands);
		return "people/husband_list";
	}
	
	@RequestMapping("husband_add")
	public String toHusbandAdd() {
		return "people/husband_add";
	} 
	
	@RequestMapping("husbandAdd")
	public String husbandAdd(Husband husband) {
		husbandService.saveHusband(husband);
		return "redirect:/people/husband_list";
	} 
	
	@RequestMapping("husband_update/{hid}")
	public String toHusbandUpdate(@PathVariable("hid") Integer hid, Model model) {
		model.addAttribute("husband", husbandService.getById(hid));
		return "people/husband_update";
	}
	
	@RequestMapping("husbandUpdate")
	public String husbandUpdate(Husband husband) {
		husbandService.saveHusband(husband);
		return "redirect:/people/husband_list";
	}
	
	@RequestMapping("husbandDelete/{hid}")
	public String husbandDelete(@PathVariable("hid") Integer hid) {
		husbandService.deleteHusband(hid);
		return "redirect:/people/husband_list";
	}
	
	@RequestMapping("deleteHusbandBatch")
	@ResponseBody
	public String deleteHusbandBatch(Integer[] ids) {
		for (Integer integer : ids) {
			husbandService.deleteHusband(integer);
		}
		return "success";
	}
	

}
