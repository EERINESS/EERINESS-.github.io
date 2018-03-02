package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.entity.Parents;
import com.springboot.service.ParentsService;

/**
* @author zzq
* @create 2018年3月1日
*/
@Controller
@RequestMapping("/parents")
public class ParentsController {
    @Autowired
    private ParentsService parentsService;
    
    private List<Parents> parentss;
    private Parents parents;
    
    @RequestMapping("parents_list")
    public String parentsList(Model model) {
        parentss = parentsService.findAllParents();
        model.addAttribute("parentss", parentss);
        return "people/parents_list";
    }
    
    @RequestMapping("parents_add")
    public String toParentsAdd() {
        return "people/parents_add";
    }
    
    @RequestMapping("parentsAdd")
    public String parentsAdd(@ModelAttribute Parents parents) {
        parentsService.saveParents(parents);
        return "redirect:/parents/parents_list";
    }
    
    @RequestMapping("parents_update/{paid}")
    public String toParentsUpdate(@PathVariable("paid") Integer paid, Model model) {
        parents = parentsService.getParentsById(paid);
        model.addAttribute("parents", parents);
        return "people/parents_update";
    }
    
    @RequestMapping("parentsUpdate")
    public String parentsUpdate(@ModelAttribute Parents parents) {
        System.out.println(parents.toString());
        parentsService.updateParents(parents);
        return "redirect:/parents/parents_list";
    }
    
    @RequestMapping("parentsDelete/{paid}")
    public String parentsDelete(@PathVariable("paid") Integer paid) {
        parentsService.deleteParents(paid);
        return "redirect:/parents/parents_list";
    }
    
    @RequestMapping("par_child/{paid}")
    public String parChild(@PathVariable("paid") Integer paid, Model model) {
        parents = parentsService.getParentsById(paid);
        model.addAttribute("parents", parents);
        return "people/par_child";
    }

}
