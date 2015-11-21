package com.boot.entity.mybatis;

/** 
* @ClassName: 		MybatisTestEntity 
* @Description: 	
* @author 			Jay
* @date 			2015年11月21日 下午9:21:08  
*/
public class MybatisTestEntity{
	
	private Integer id;

	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MybatisTestEntity(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Hello [id=" + id + ", name=" + name + "]";
	}

	public MybatisTestEntity() {
	}
	
}

