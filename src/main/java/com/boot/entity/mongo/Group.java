package com.boot.entity.mongo;

import java.io.Serializable;
import java.util.List;

/**
 * @Auth jay
 * @date 2015年11月25日 下午5:01:00
 */
public class Group implements Serializable {

	private static final long serialVersionUID = -373192969160721590L;

	// 组名
	private String name;

	// 成员
	private List<User> userList;

	@Override
	public String toString() {
		return "Group [name=" + name + ", userList=" + userList + "]";
	}

	public Group() {
	}

	public Group(String name, List<User> userList) {
		super();
		this.name = name;
		this.userList = userList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

}
