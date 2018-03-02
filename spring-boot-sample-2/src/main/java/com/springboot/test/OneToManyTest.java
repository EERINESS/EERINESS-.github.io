package com.springboot.test;
/**
* @author zzq
* @create 2018年3月1日
*/

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.BeforeClass;
import org.junit.Test;

import com.springboot.entity.Child;
import com.springboot.entity.Parents;

public class OneToManyTest {
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }
    
    @Test
    public void addChild() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();    //  start   transaction
        
        Parents parents = new Parents();
        parents.setParname("蟹老板");
        
        //Parents 中包含的 child1,  child2
        Child child1 = new Child();
        child1.setChname("海绵宝宝");
        parents.addChild(child1);
        
        Child child2 = new Child();
        child2.setChname("派大星");
        parents.addChild(child2);
        
        em.persist(parents);    //persist   parents object
        em.getTransaction().commit();   //transaction commit
        em.close();
        factory.close();
    }

}
