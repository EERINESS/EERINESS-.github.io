package com.springboot.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springboot.entity.Wife;

/**
*妻子表的底层
* 
* @author zzq
* @create 2018年1月23日
*/
@Transactional
public interface WifeRepository extends JpaRepository<Wife, Integer> {
	@Query("select w from Wife w where w.wname=:wname")
	Wife findByName(@Param("wname") String wname);

}
