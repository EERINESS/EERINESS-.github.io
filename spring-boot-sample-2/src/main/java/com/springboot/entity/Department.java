package com.springboot.entity;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.GenerationType;


/**
* 部门表
* 
* @author zzq
* @create 2018年1月26日
*/
@Entity
@Table(name="department")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="dep_id")
	public Integer depid;
	
	@NotNull@Column(name="dep_name")
	public String depname;
	
	@OneToMany(cascade= {CascadeType.ALL})
	@JoinColumn(name="department_id")
	public Collection<Employee> employee;

	public Department() {
		super();
	}

	public Department(Integer depid, String depname, Collection<Employee> employee) {
		super();
		this.depid = depid;
		this.depname = depname;
		this.employee = employee;
	}

	public Integer getDepid() {
		return depid;
	}

	public void setDepid(Integer depid) {
		this.depid = depid;
	}

	public String getDepname() {
		return depname;
	}

	public void setDepname(String depname) {
		this.depname = depname;
	}

	public Collection<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(Collection<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Department [depid=" + depid + ", depname=" + depname + ", employee=" + employee + "]";
	}

	
	
	

}
