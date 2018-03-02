package com.springboot.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
* 员工表
* 
* @author zzq
* @create 2018年1月22日
*/
@Entity
@Table(name="employee")
public class Employee implements Serializable {
	private static final long serialVersionUID = -5756749637394213694L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="emp_id")
	private Integer eid;
	
	@NotNull@Column(name="emp_name")
	private String ename;

	public Employee() {
		super();
	}

	public Employee(Integer eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}
	
	

}
