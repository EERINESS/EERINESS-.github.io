package com.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.entity.Husband;
import com.springboot.repository.HusbandRepository;
import com.springboot.service.HusbandService;


/**
* @author zzq
* @create 2018年1月24日
*/
@Transactional
@Service
public class HusbandServiceImpl implements HusbandService  {
	@Autowired
	private HusbandRepository husbandRepository;

	@Override
	public void saveHusband(Husband husband) {
		husbandRepository.save(husband);
	}

	@Override
	public List<Husband> findAllHusband() {
		return husbandRepository.findAll();
	}

	@Override
	public void deleteHusband(Integer hid) {
		husbandRepository.delete(hid);
	}

	@Override
	public Husband getById(Integer hid) {
		return husbandRepository.getOne(hid);
	}

	@Override
	public void updateHusband(Husband husband) {
		husbandRepository.save(husband);
	}

}
