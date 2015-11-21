package com.boot.repository.jpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.boot.entity.jpa.JpaTestEntity;

/** 
* @ClassName: 		JpaTestRepository 
* @Description: 	
* @author 			Jay
* @date 			2015年11月21日 下午9:17:38  
*/
public interface JpaTestRepository extends CrudRepository<JpaTestEntity, Integer>{

	/**
	 * 查找所有
	 */
	 List<JpaTestEntity>  findAll();

}



