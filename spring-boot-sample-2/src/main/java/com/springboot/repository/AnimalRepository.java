package com.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.springboot.entity.Animal;

/**
* 1. Repository<Animal, Integer> 是一个空接口，也就是一个标记
* 2. 若我们定义的接口实现了 Repository,  则接口会被 IOC 容器识别为一个 Repository Bean
* 		纳入到我们的 IOC 容器中，进而可以在该接口中定义满足一定规范的方法
* 3. 实际上也可以通过 @RepositoryDefinition 注解来替代实现 Repository 接口
* 
* 
*  在 Repository 这个子接口中声明的方法不能随便声明， 需要一定的规范
*  1. 查询的方法名是以 find|read|get 开头
*  2. 涉及到条件查询时，查询条件用关键字连接
*  3. 注意：条件属性的关键字是以大写字母开头
*  4. 支持属性的级联查询，若当前类有符合条件的属性，则优先使用，而不使用级联属性
*  	若需要使用级联属性，则属性之间使用_连接
* 
* @author zzq
* @create 2018年1月22日
*/
public interface AnimalRepository extends Repository<Animal, Integer> {
	/**
	 * 简单查询命名方法规范
	 */
	//带条件查询表中的数据
	List<Animal> getByAnName(String anName);
	//带条件查询表中的数据
	Animal getByAnId(Integer anId);
	//查询表中所有的数据
	List<Animal> findAll();
	
	/**
	 * 可以通过自定义的 JPQL 完成 Update 操作和 Delete 操作，注意 JPQL 不支持 insert 操作
	 * 可以在 @Query 中编写 JPQL 语句，但必须通过 @Modifying 进行修饰，以通知 SpringData，这是一个 UPDATE 或 DELETE 操作
	 * 注意：update 和 delete 需要操作的事物，需要在 Service 方法上添加事物操作
	 * 默认情况下，SpringData 每个方法上都有事物，但都是一个只读事物，他们不能完成修改操作
	 */
	
	@Modifying
	@Query("update Animal a set a.anName=:anName , a.anType=:anType where a.anId=:anId")
	void updateAnimal(@Param("anId") Integer anId, @Param("anName") String anName, @Param("anType") String anType);

	@Modifying
	@Query("delete from Animal a where a.anId=?1")
	void deleteAnimal(Integer anId);
	
	
}
