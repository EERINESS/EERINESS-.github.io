package com.springboot.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Parents;

/**
* @author zzq
* @create 2018年3月1日
*/
@Transactional
public interface ParentsRepository extends JpaRepository<Parents, Integer> {

}
