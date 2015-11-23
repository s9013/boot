package com.boot.service.iface;

import java.util.List;

import com.boot.entity.jpa.JpaTestEntity;
import com.boot.entity.mongo.MongoTestEntity;
import com.boot.entity.mybatis.MybatisTestEntity;
import com.boot.vo.common.PageInputVo;
import com.boot.vo.common.PageOupterVo;

/** 
* @ClassName: 		TestService 
* @Description: 	
* @author 			Jay
* @date 			2015年11月21日 下午9:13:34  
*/
public interface TestService {

	/**
	 * test method
	 * @return
	 */
	public String test();
	
	/**
	 * test JPA
	 * @return
	 */
	public List<JpaTestEntity> testJpa();
	
	/**
	 * test mybatis
	 * @return
	 */
	public List<MybatisTestEntity> testMybatis();
	
	/**
	 * test mybatis page
	 * @return
	 */
	public PageOupterVo<MybatisTestEntity> testMybatisPage(PageInputVo pageInputVo);
	
	
	/**
	 * test mongodb
	 * @return
	 */
	public List<MongoTestEntity> testMongodb();
	
}

