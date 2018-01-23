package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.entity.Animal;
import com.springboot.service.AnimalService;

/**
* @author zzq
* @create 2018年1月23日
*/
@Controller
@RequestMapping("animal")
public class AnimalController {
	@Autowired
	private AnimalService animalService;
	private Animal animal;
	private List<Animal> animals;
	
	@RequestMapping("animal_list")
	public String animalList(Model model) {
		animals = animalService.findAll();
		model.addAttribute("animals", animals);
		return "animal/animal_list";
	}
	
	@RequestMapping("animal_add")
	public String toAnimalAdd() {
		return "animal/animal_add";
	}
	
	@RequestMapping("animalAdd")
	public String animalAdd(Animal animal) {
		animalService.saveAnimal(animal);
		return "redirect:/animal/animal_list";
	}
	
	@RequestMapping("animalDelete/{anId}")
	public String animalDelete(@PathVariable Integer anId) {
		animalService.deleteAnimal(anId);
		return "redirect:/animal/animal_list";
	}
	
	@RequestMapping("deleteAnimalBatch")
	@ResponseBody
	public String animalDelete(Integer[] ids) {
		for (Integer integer : ids) {
			animalService.deleteAnimal(integer);
		}
		return "success";
	}
	
	@RequestMapping("animal_update/{anId}")
	public String toAnimalUpdate(@PathVariable Integer anId, Model model) {
		animal = animalService.getByAnId(anId);
		model.addAttribute("animal", animal);
		return "animal/animal_update";
	}
	
	@RequestMapping("animalUpdate")
	public String animalUpdate(Animal animal) {
		//animalService.updateAnimal(animal.getAnId(), animal.getAnName(), animal.getAnType());
		animalService.saveAnimal(animal);
		return "redirect:/animal/animal_list";
	}

}
