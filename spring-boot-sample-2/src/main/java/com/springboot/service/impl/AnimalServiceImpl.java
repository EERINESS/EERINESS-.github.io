package com.springboot.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Animal;
import com.springboot.repository.AnimalCrudRepository;
import com.springboot.repository.AnimalRepository;
import com.springboot.service.AnimalService;

/**
* Animal 表的服务层
* 
* @author zzq
* @create 2018年1月23日
*/
@Transactional
@Service
public class AnimalServiceImpl implements AnimalService {
	@Autowired
	private AnimalRepository animalRepository;
	@Autowired
	private AnimalCrudRepository animalCrudRepository;

	@Override
	public List<Animal> getByAnName(String anName) {
		return animalRepository.getByAnName(anName);
	}
	
	@Override
	public Animal getByAnId(Integer anId) {
		return animalRepository.getByAnId(anId);
	}
	
	@Override
	public List<Animal> findAll() {
		return animalRepository.findAll();
	}

	@Override
	public void saveAnimal(Animal animal) {
		animalCrudRepository.save(animal);
	}

	/*@Override
	public void updateAnimal(Animal animal) {
		animalCrudRepository.updateAnimal(animal);
	}*/
	
	public void updateAnimal(Integer anId, String anName, String anType) {
		animalRepository.updateAnimal(anId, anName, anType);
	}
	
	@Override
	public void deleteAnimal(Integer anId) {
		animalRepository.deleteAnimal(anId);
	}


	@Override
	public void updateAnimal(Animal animal) {
		//调用 CrudRepository 接口中的 save() 方法，它会判断你的 bean 中有没有 id , 有 id 就执行 update 操作，没有 id 就执行 save 操作
		animalCrudRepository.save(animal);
	}

	

}
