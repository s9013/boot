package com.boot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.boot.entity.jpa.JpaTestEntity;
import com.boot.entity.mongo.MongoTestEntity;
import com.boot.entity.mybatis.MybatisTestEntity;
import com.boot.repository.jpa.JpaTestRepository;
import com.boot.repository.mybatis.MybatisTestRepository;
import com.boot.service.iface.TestService;
import com.boot.vo.common.MybatisPage;
import com.boot.vo.common.PageInputVo;
import com.boot.vo.common.PageOupterVo;



/** 
* @ClassName: 		TestServiceImpl 
* @Description: 	
* @author 			Jay
* @date 			2015年11月21日 下午9:15:03  
*/
@Service(value="TestService")
public class TestServiceImpl implements TestService {

	@Autowired
	JpaTestRepository jpaTestRepository;
	
	@Autowired
	MybatisTestRepository mybatisTestRepository;
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	
	public String test() {
		return "Hello world,this is service!";
	}

	public List<JpaTestEntity> testJpa() {
		List<JpaTestEntity> list = jpaTestRepository.findAll();
		return list;
	}

	public List<MybatisTestEntity> testMybatis() {
		List<MybatisTestEntity> list = mybatisTestRepository.find();
		return list;
	}

	public PageOupterVo<MybatisTestEntity> testMybatisPage(PageInputVo pageInputVo) {
		MybatisPage<MybatisTestEntity> mybatisPage = new MybatisPage<MybatisTestEntity>();
		mybatisPage.setPageNo(pageInputVo.getPage());
		mybatisPage.setPageSize(pageInputVo.getPageSize());
		List<MybatisTestEntity> list = mybatisTestRepository.findAndPage(mybatisPage);
		
		PageOupterVo<MybatisTestEntity> pageVo = new PageOupterVo<MybatisTestEntity>();
		pageVo.setCount(mybatisPage.getTotalRecord());
		pageVo.setData(list);
		
		return pageVo;
	}

	public List<MongoTestEntity> testMongodb() {
		List<MongoTestEntity> list = mongoTemplate.findAll(MongoTestEntity.class);
		return list;
	}

}

