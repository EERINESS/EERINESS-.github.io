package com.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.entity.Department;
import com.springboot.repository.DepartmentRepository;
import com.springboot.service.DepartmentService;

/**
* @author zzq
* @create 2018年2月28日
*/
@Transactional
@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public List<Department> findAll() {
		return departmentRepository.findAll();
	}

	@Override
	public void saveDepartment(Department department) {
		departmentRepository.save(department);
	}

	@Override
	public void updateDepartment(Department department) {
		departmentRepository.save(department);
	}

	@Override
	public Department getById(Integer depId) {
		return departmentRepository.getOne(depId);
	}

	@Override
	public void deleteDepartment(Integer depId) {
		departmentRepository.delete(depId);
	}
	

}
