package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.entity.Child;
import com.springboot.entity.Parents;
import com.springboot.service.ChildService;
import com.springboot.service.ParentsService;

/**
* @author zzq
* @create 2018年3月2日
*/
@Controller
@RequestMapping("/child")
public class ChildController {
    @Autowired
    private ChildService childService;
    @Autowired
    private ParentsService parentsService;
    
    private List<Child> childs;
    private Child child;
    private List<Parents> parentss;
    private Parents parents;
    
    @RequestMapping("child_list")
    public String parentsList(Model model) {
        childs = childService.findAllChild();
        model.addAttribute("childs", childs);
        return "people/child_list";
    }
    
    @RequestMapping("child_add")
    public String toParentsAdd(Model model) {
        parentss = parentsService.findAllParents();
        model.addAttribute("parentss", parentss);
        return "people/child_add";
    }
    
    @RequestMapping("childAdd")
    public String parentsAdd(@ModelAttribute Child child) {
        System.out.println(child.toString());
        parents = parentsService.getParentsById(child.getParents().getParid());
        parents.addChild(child);
        parentsService.updateParents(parents);
        return "redirect:/child/child_list";
    }
    
    @RequestMapping("child_update/{chid}")
    public String toParentsUpdate(@PathVariable("chid") Integer chid, Model model) {
        child = childService.getChildById(chid);
        parentss = parentsService.findAllParents();
        model.addAttribute("parentss", parentss);
        model.addAttribute("child", child);
        return "people/child_update";
    }
    
    
    @RequestMapping("childDelete/{chid}")
    public String parentsDelete(@PathVariable("chid") Integer chid) {
        childService.deleteChild(chid);
        return "redirect:/child/child_list";
    }
    

}
