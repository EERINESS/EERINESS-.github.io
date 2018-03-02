package com.springboot.service;
/**
* @author zzq
* @create 2018年3月2日
*/

import java.util.List;

import com.springboot.entity.Child;

public interface ChildService {
    List<Child> findAllChild();
    Child getChildById(Integer chid);
    void saveChild(Child child);
    void updateChild(Child child);
    void deleteChild(Integer chid);
}
