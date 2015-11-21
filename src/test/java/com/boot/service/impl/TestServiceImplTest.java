package com.boot.service.impl;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.boot.entity.jpa.JpaTestEntity;
import com.boot.service.iface.TestService;

/** 
* @ClassName: 		TestServiceImplTest 
* @Description: 	
* @author 			Jay
* @date 			2015年11月21日 下午9:44:02  
*/
@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations={ "classpath:META-INF/spring/applicationContext.xml", 
		"classpath:META-INF/spring/applicationContext-jpa.xml"})
public class TestServiceImplTest {

	private Logger logger = LoggerFactory.getLogger(TestServiceImplTest.class); 
	
	@Autowired
	TestService testService;
	
	@Ignore
	@Test
	public void testTest() {
		fail("Not yet implemented");
	}

	@Test
	public void testTestJpa() {
		List<JpaTestEntity> list = testService.testJpa();
		logger.info(list.toString());
	}

}

