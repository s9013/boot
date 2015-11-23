package com.boot.vo.common;

import java.io.Serializable;
/**
 *  分页对象
 * @author jay
 *
 */
import java.util.List;

/**
 * @ClassName: PageVo
 * @Description:
 * @author Jay
 * @date 2015年11月23日 下午9:22:35
 */
public class PageOupterVo<T> implements Serializable {

	private static final long serialVersionUID = -6855481267488972830L;

	private long count;// 总数
	private List<T> data;// 数据

	public PageOupterVo() {
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "PageVo [count=" + count + ", data=" + data + "]";
	}

}
