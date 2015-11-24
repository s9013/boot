package com.boot.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.entity.jpa.JpaTestEntity;
import com.boot.entity.mongo.MongoTestEntity;
import com.boot.entity.mybatis.MybatisTestEntity;
import com.boot.service.iface.TestService;
import com.boot.vo.common.PageInputVo;
import com.boot.vo.common.PageOupterVo;

/** 
* @ClassName: 		TestController 
* @Description: 	
* @author 			Jay
* @date 			2015年11月21日 下午3:09:50  
*/
@RestController
public class TestController {

	private Logger logger = LoggerFactory.getLogger(TestController.class); 
	
	@Autowired
	TestService testService;
	
	@RequestMapping(value="testMvc")
	public String testMvc(){
		logger.info("test mvc>>>");
		String str = testService.test();
		logger.debug(str);
		return str;
	}
	
	
	/**
	 * 测试jpa
	 * @return
	 */
	@RequestMapping(value="testJpa")
	public List<JpaTestEntity> testJpa(){
		logger.info("test jpa start>>>");
		List<JpaTestEntity> list = testService.testJpa();
		logger.debug(list.toString());
		return list;
	}
	
	/**
	 * 测试mybatis
	 * @return
	 */
	@RequestMapping(value="testMybatis")
	public List<MybatisTestEntity> testMybatis(){
		logger.info("test mybatis start>>>");
		List<MybatisTestEntity> list = testService.testMybatis();
		logger.debug(list.toString());
		return list;
	}
	
	/**
	 * 测试mybatis 分页
	 * @return
	 */
	@RequestMapping(value="testMybatisPage")
	public PageOupterVo<MybatisTestEntity> testMybatisPage(@RequestBody PageInputVo pageInputVo){
		logger.info("test mybatis page start>>>");
		PageOupterVo<MybatisTestEntity> result = testService.testMybatisPage(pageInputVo);
		logger.debug(result.toString());
		return result;
	}
	
	/**
	 * 测试mongodb
	 * @return
	 */
	@RequestMapping(value="testMongodb")
	public List<MongoTestEntity> testMongodb(){
		logger.info("test mongodb start>>>");
		List<MongoTestEntity> result = testService.testMongodb();
		logger.debug(result.toString());
		return result;
	}

}
