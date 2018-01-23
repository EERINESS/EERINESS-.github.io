package com.springboot.service;

import java.util.List;

import com.springboot.entity.Animal;

/**
* @author zzq
* @create 2018年1月23日
*/
public interface AnimalService {
	List<Animal> getByAnName(String anName);
	Animal getByAnId(Integer anId);
	List<Animal> findAll();
	void saveAnimal(Animal animal);
	void updateAnimal(Animal animal);
	public void updateAnimal(Integer anId, String anName, String anType);
	void deleteAnimal(Integer anId);
}
