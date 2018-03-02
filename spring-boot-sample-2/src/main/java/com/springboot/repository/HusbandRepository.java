package com.springboot.repository;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springboot.entity.Husband;

/**
* 丈夫表的底层
* 
* @author zzq
* @create 2018年1月23日
*/
@Transactional
public interface HusbandRepository extends JpaRepository<Husband, Integer> {
	@Query("select h from Husband h where h.hname=:hname")
	Husband findByName(@Param("hname") String hname);

}
