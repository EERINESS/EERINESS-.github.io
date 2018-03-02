package com.springboot.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Child;
import com.springboot.repository.ChildRepository;
import com.springboot.service.ChildService;

/**
* @author zzq
* @create 2018年3月2日
*/
@Transactional
@Service
public class ChildServiceImpl implements ChildService {
    @Autowired
    private ChildRepository childRepository;
    

    @Override
    public List<Child> findAllChild() {
        return childRepository.findAll();
    }

    @Override
    public Child getChildById(Integer chid) {
        return childRepository.getOne(chid);
    }

    @Override
    public void saveChild(Child child) {
        childRepository.save(child);
    }

    @Override
    public void updateChild(Child child) {
        childRepository.save(child);
    }

    @Override
    public void deleteChild(Integer chid) {
        childRepository.delete(chid);
    }

}
