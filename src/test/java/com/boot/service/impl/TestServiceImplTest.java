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
import com.boot.entity.mongo.MongoTestEntity;
import com.boot.entity.mybatis.MybatisTestEntity;
import com.boot.service.iface.TestService;
import com.boot.vo.common.PageInputVo;
import com.boot.vo.common.PageOupterVo;

/** 
* @ClassName: 		TestServiceImplTest 
* @Description: 	
* @author 			Jay
* @date 			2015年11月21日 下午9:44:02  
*/
@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations={ "classpath:META-INF/spring/applicationContext.xml", 
		"classpath:META-INF/spring/applicationContext-jpa.xml",
		"classpath:META-INF/spring/applicationContext-mybatis.xml",
		"classpath:META-INF/spring/applicationContext-mongo.xml"})
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

	@Test
	public void testMybatis() {
		List<MybatisTestEntity> list = testService.testMybatis();
		logger.info(list.toString());
	}
	
	
	@Test
	public void testMybatisPage() {
		PageInputVo pageInputVo = new PageInputVo(2, 5);
		PageOupterVo<MybatisTestEntity> vo = testService.testMybatisPage(pageInputVo);
		logger.info(vo.toString());
	}
	
	@Test
	public void testMongodb(){
		List<MongoTestEntity> list = testService.testMongodb();
		logger.info(list.toString());
	}
}

