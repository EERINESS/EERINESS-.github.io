package com.springboot.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Parents;
import com.springboot.repository.ParentsRepository;
import com.springboot.service.ParentsService;

/**
* @author zzq
* @create 2018年3月1日
*/
@Transactional
@Service
public class ParentsServiceImpl implements ParentsService {
    @Autowired
    private ParentsRepository parentsRepository;

    @Override
    public List<Parents> findAllParents() {
        return parentsRepository.findAll();
    }

    @Override
    public void saveParents(Parents parents) {
        parentsRepository.save(parents);
    }

    @Override
    public void updateParents(Parents parents) {
        parentsRepository.saveAndFlush(parents);
    }

    @Override
    public void deleteParents(Integer paid) {
        parentsRepository.delete(paid);
    }

    @Override
    public Parents getParentsById(Integer paid) {
        return parentsRepository.getOne(paid);
    }

}
