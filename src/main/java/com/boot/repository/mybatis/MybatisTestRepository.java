package com.boot.repository.mybatis;

import java.util.List;

import com.boot.entity.mybatis.MybatisTestEntity;

/** 
* @ClassName: 		MybatisTestRepository 
* @Description: 	
* @author 			Jay
* @date 			2015年11月21日 下午9:18:12  
*/
public interface MybatisTestRepository {

	List<MybatisTestEntity> find();
	
}

