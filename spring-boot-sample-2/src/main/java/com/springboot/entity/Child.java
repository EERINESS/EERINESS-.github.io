package com.springboot.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.GenerationType;


/**
* 子女表
* 
* @author zzq
* @create 2018年3月1日
*/
@Entity
@Table(name="child")
public class Child implements Serializable {
    private static final long serialVersionUID = -1607994181788109147L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ch_id")
    private Integer chid;
    
    @Column(name = "ch_name", length = 40, nullable = false)
    private String chname;
    
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, optional=true)
    @JoinColumn(name="par_id")  //这里设置 JoinColumn 设置了外键的名字，并且 Child 是关系维护端
    private Parents parents;

    public Child() {
        super();
    }

    public Child(Integer chid, String chname, Parents parents) {
        super();
        this.chid = chid;
        this.chname = chname;
        this.parents = parents;
    }

    public Integer getChid() {
        return chid;
    }

    public void setChid(Integer chid) {
        this.chid = chid;
    }

    public String getChname() {
        return chname;
    }

    public void setChname(String chname) {
        this.chname = chname;
    }

    public Parents getParents() {
        return parents;
    }

    public void setParents(Parents parents) {
        this.parents = parents;
    }

    @Override
    public String toString() {
        return "Child [chid=" + chid + ", chname=" + chname + ", parents=" + parents + "]";
    }
    
    
}
