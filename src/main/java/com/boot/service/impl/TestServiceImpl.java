package com.boot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.entity.jpa.JpaTestEntity;
import com.boot.entity.mybatis.MybatisTestEntity;
import com.boot.repository.jpa.JpaTestRepository;
import com.boot.repository.mybatis.MybatisTestRepository;
import com.boot.service.iface.TestService;



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

}

