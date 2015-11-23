package com.boot.entity.mongo;

import java.io.Serializable;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

/** 
* @ClassName: 		MongoTestEntity 
* @Description: 	
* @author 			Jay
* @date 			2015年11月21日 下午9:21:44  
*/
@Document(collection="hello")
public class MongoTestEntity implements Serializable{

	private static final long serialVersionUID = -8457618801441101475L;

	@Id
	private String id;
	
	private String name;

	public MongoTestEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MongoTestEntity(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MongoTestEntity [id=" + id + ", name=" + name + "]";
	}
	
	

}

