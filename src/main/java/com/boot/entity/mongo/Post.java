package com.boot.entity.mongo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @Auth jay
 * @date 2015年11月25日 下午4:36:48
 */
@Document(collection = "Post")
public class Post implements Serializable {

	private static final long serialVersionUID = -9204833959832067449L;

	@Id
	private String id;

	// 作者
	private User user;

	// 内容
	private Content content;

	// 时间
	private Date time;

	// 点赞
	private List<Like> likeList;

	// 评论
	private List<Comment> commentList;

	// 组
	private String groupId;

	public Post() {
	}

	public Post(User user, Content content, List<Like> likeList, List<Comment> commentList) {
		super();
		this.user = user;
		this.content = content;
		this.likeList = likeList;
		this.commentList = commentList;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", user=" + user + ", content=" + content + ", time=" + time + ", likeList="
				+ likeList + ", commentList=" + commentList + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Content getContent() {
		return content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public List<Like> getLikeList() {
		return likeList;
	}

	public void setLikeList(List<Like> likeList) {
		this.likeList = likeList;
	}

	public List<Comment> getCommentList() {
		return commentList;
	}

	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}



}
