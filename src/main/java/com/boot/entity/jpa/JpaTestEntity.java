package com.boot.entity.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/** 
* @ClassName: 		JpaTestEntity 
* @Description: 	
* @author 			Jay
* @date 			2015年11月21日 下午9:19:57  
*/
@Entity
@Table(name = "user")
public class JpaTestEntity {

	private static final long serialVersionUID = -2509439493563083804L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "name")
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

	public JpaTestEntity(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Hello [id=" + id + ", name=" + name + "]";
	}

	public JpaTestEntity() {
	}
	
}

