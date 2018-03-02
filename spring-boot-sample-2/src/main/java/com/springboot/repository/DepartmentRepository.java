package com.springboot.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.entity.Department;

/**
* 部门底层
* 
* @author zzq
* @create 2018年2月28日
*/
@Transactional
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
	

}
