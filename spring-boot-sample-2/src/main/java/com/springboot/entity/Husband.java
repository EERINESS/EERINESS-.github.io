package com.springboot.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
* 丈夫表
* 
* @author zzq
* @create 2018年1月23日
*/
@Entity
@Table(name="husband")
public class Husband implements Serializable {
	private static final long serialVersionUID = -6080987084160867769L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer hid;
	
	@NotNull@Column(nullable=false)
	private String hname;

	
	@OneToOne(targetEntity = Wife.class, cascade = {CascadeType.ALL})
	@JoinColumn(name = "wife_id", referencedColumnName="wid")
	private Wife wife;

	public Husband() {
		super();
	}

	public Husband(String hname) {
		super();
		this.hname = hname;
	}

	@Override
	public String toString() {
		return "Husband [hid=" + hid + ", hname=" + hname + ", wife=" + wife + "]";
	}

	public Integer getHid() {
		return hid;
	}

	public void setHid(Integer hid) {
		this.hid = hid;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public Wife getWife() {
		return wife;
	}

	public void setWife(Wife wife) {
		this.wife = wife;
	}


	

}
