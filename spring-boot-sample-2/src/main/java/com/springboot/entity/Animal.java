package com.springboot.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
*动物表（单表操作练习）
* 
* @author zzq
* @create 2018年1月22日
*/
@Entity
@Table(name="animal")
public class Animal implements Serializable {
	private static final long serialVersionUID = -5504639895386317324L;
	@Id
	@GeneratedValue
	@Column(name="an_id")
	private Integer anId;
	@Column(name="an_name")
	private String anName;
	@Column(name="an_type")
	private String anType;
	@Column(name="an_age")
	private Integer anAge;
	@Column(name="an_sex")
	private String anSex;
	@Column(name="an_birthday")
	private String anBirthday;
	
	public Animal() {
		super();
	}
	public Animal(Integer anId, String anName, String anType, Integer anAge, String anSex, String anBirthday) {
		super();
		this.anId = anId;
		this.anName = anName;
		this.anType = anType;
		this.anAge = anAge;
		this.anSex = anSex;
		this.anBirthday = anBirthday;
	}
	public Integer getAnId() {
		return anId;
	}
	public void setAnId(Integer anId) {
		this.anId = anId;
	}
	public String getAnName() {
		return anName;
	}
	public void setAnName(String anName) {
		this.anName = anName;
	}
	public String getAnType() {
		return anType;
	}
	public void setAnType(String anType) {
		this.anType = anType;
	}
	public Integer getAnAge() {
		return anAge;
	}
	public void setAnAge(Integer anAge) {
		this.anAge = anAge;
	}
	public String getAnSex() {
		return anSex;
	}
	public void setAnSex(String anSex) {
		this.anSex = anSex;
	}
	public String getAnBirthday() {
		return anBirthday;
	}
	public void setAnBirthday(String anBirthday) {
		this.anBirthday = anBirthday;
	}
	@Override
	public String toString() {
		return "Animal [anId=" + anId + ", anName=" + anName + ", anType=" + anType + ", anAge=" + anAge + ", anSex="
				+ anSex + ", anBirthday=" + anBirthday + "]";
	}
	
	
}
