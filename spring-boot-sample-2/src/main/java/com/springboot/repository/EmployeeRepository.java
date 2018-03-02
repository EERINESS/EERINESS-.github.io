package com.springboot.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Employee;

/**
* 员工表的底层
* 
* @author zzq
* @create 2018年2月28日
*/
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
