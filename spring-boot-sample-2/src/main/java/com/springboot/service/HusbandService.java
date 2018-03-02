package com.springboot.service;

import java.util.List;

import com.springboot.entity.Husband;

/**
* @author zzq
* @create 2018年1月24日
*/
public interface HusbandService  {
	void saveHusband(Husband husband);
	List<Husband> findAllHusband();
	void deleteHusband(Integer hid);
	Husband getById(Integer hid);
	void updateHusband(Husband husband);
}
