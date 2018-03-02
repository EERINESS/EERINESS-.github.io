package com.springboot.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Child;

/**
* @author zzq
* @create 2018年3月2日
*/
@Transactional
public interface ChildRepository extends JpaRepository<Child, Integer> {

}
