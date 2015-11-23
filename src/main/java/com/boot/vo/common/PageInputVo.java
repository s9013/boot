package com.boot.vo.common;

import java.io.Serializable;

/**
 * @auth jay
 * @date 2015年11月23日 下午5:54:17
 */
public class PageInputVo implements Serializable {

	private static final long serialVersionUID = 2588875529683651140L;

	private int page;
	private int pageSize;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	@Override
	public String toString() {
		return "PageInputVo [page=" + page + ", pageSize=" + pageSize + "]";
	}

	public PageInputVo() {
	}

	public PageInputVo(int page, int pageSize) {
		super();
		this.page = page;
		this.pageSize = pageSize;
	}

}
