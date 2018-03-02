package com.springboot.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.CascadeType;




/**
* 父母表（OneToMany 和 ManyToOne ）
* 
* @author zzq
* @create 2018年3月1日
*/
@Entity
@Table(name="parents")
public class Parents implements Serializable {
    private static final long serialVersionUID = 4532420030944914574L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="par_id")
	private Integer parid;
	
	@NotNull@Column(name="par_name")
	private String parname;
	
	@OneToMany(cascade= {CascadeType.REFRESH, CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REMOVE}, mappedBy="parents")  /*这里配置关系，并确定关系维护端和被维护端，
	mappBy 表示关系被维护端，只有关系端有权去 更新外键。这里还有注意的是 OneToMany 的默认
	加载方式是懒加载，当看到关系设置的最后一个单词是 Many，那么该加载默认为懒加载。
	*/
	private Set<Child> child = new HashSet<Child>();
	
	/**
	 * 该方法用于向父母 Parents 中添加子女 Child 
	 */
	public void addChild(Child child) {
	    child.setParents(this);    //用关系维护端来维护关系
	    this.child.add(child);
	}

    public Parents() {
        super();
    }

    public Parents(Integer parid, String parname, Set<Child> child) {
        super();
        this.parid = parid;
        this.parname = parname;
        this.child = child;
    }

    public Integer getParid() {
        return parid;
    }

    public void setParid(Integer parid) {
        this.parid = parid;
    }

    public String getParname() {
        return parname;
    }

    public void setParname(String parname) {
        this.parname = parname;
    }

    public Set<Child> getChild() {
        return child;
    }

    public void setChild(Set<Child> child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return "Parents [parid=" + parid + ", parname=" + parname + ", child=" + child + "]";
    }
	
	
}
