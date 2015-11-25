package com.boot.entity.mongo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Id;

/**
*@Auth						jay
*@date						2015年11月25日 下午5:11:54
*/
public class Friends implements Serializable {

	private static final long serialVersionUID = 1670455761308314907L;

	@Id
	private String id;
	
	private Integer userId;
	
	private List<Group> groupList;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public List<Group> getGroupList() {
		return groupList;
	}

	public void setGroupList(List<Group> groupList) {
		this.groupList = groupList;
	}
	
	
	
}
