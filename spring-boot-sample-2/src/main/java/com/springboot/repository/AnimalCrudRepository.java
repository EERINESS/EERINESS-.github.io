package com.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.Animal;

/**
* @author zzq
* @create 2018年1月23日
*/
@Repository
public interface AnimalCrudRepository extends CrudRepository<Animal, Integer> {

}
