package com.springboot.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
* 妻子表
* 
* @author zzq
* @create 2018年1月23日
*/
@Entity
@Table(name="wife")
public class Wife implements Serializable {
	private static final long serialVersionUID = -286392253104541764L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer wid;
	
	@NotNull@Column(nullable = false)
	private String wname;
	
	@OneToOne(mappedBy = "wife", cascade= {CascadeType.ALL})
	private Husband husband;

	public Wife() {
		super();
	}

	public Wife(String wname) {
		super();
		this.wname = wname;
	}



	@Override
	public String toString() {
		return "Wife [wid=" + wid + ", wname=" + wname + ", husband=" + husband + "]";
	}

	@Override
	public int hashCode() {
		return wid;
	}
	
  @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Wife))
            return  false;
        Wife wife = (Wife) obj;
        if(wife.getWid() == this.wid)
            return true;
        else
            return false;
    }

	public Integer getWid() {
		return wid;
	}

	public void setWid(Integer wid) {
		this.wid = wid;
	}

	public String getWname() {
		return wname;
	}

	public void setWname(String wname) {
		this.wname = wname;
	}

	public Husband getHusband() {
		return husband;
	}

	public void setHusband(Husband husband) {
		this.husband = husband;
	}
	
	
}
