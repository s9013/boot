package com.boot.service.iface;

import java.util.List;

import com.boot.entity.jpa.JpaTestEntity;

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
	
}
