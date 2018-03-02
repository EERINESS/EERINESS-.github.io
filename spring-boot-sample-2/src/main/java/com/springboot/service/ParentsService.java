package com.springboot.service;

import java.util.List;


import com.springboot.entity.Parents;

/**
* @author zzq
* @create 2018年3月1日
*/

public interface ParentsService {
    List<Parents> findAllParents();
    void saveParents(Parents parents);
    void updateParents(Parents parents);
    void deleteParents(Integer paid);
    Parents getParentsById(Integer paid);
}
