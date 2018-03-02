package com.springboot.service;
/**
* @author zzq
* @create 2018年2月28日
*/

import java.util.List;

import com.springboot.entity.Department;

public interface DepartmentService {
	List<Department> findAll();
	void saveDepartment(Department department);
	void updateDepartment(Department department);
	Department getById(Integer depId);
	void deleteDepartment(Integer depId);
}
