package com.boot.vo.common;

import java.util.List;

public class MybatisPage<T> {

	public static final int DEFAULT_PAGE_SIZE = 10;

	protected int pageNo = 1; // 当前页, 默认为第1页
	protected int pageSize = DEFAULT_PAGE_SIZE; // 每页记录数
	protected long totalRecord = -1; // 总记录数, 默认为-1, 表示需要查询
	protected int totalPage = -1; // 总页数, 默认为-1, 表示需要计算

	// 定义过滤字段
	protected Object filter1;
	protected Object filter2;
	protected Object filter3;
	protected Object filter4;
	protected Object filter5;
	protected Object filter6;
	protected Object filter7;
	protected Object filter8;
	protected Object filter9;
	protected Object filter10;

	public Object getFilter1() {
		return filter1;
	}

	public void setFilter1(Object filter1) {
		this.filter1 = filter1;
	}

	public Object getFilter2() {
		return filter2;
	}

	public void setFilter2(Object filter2) {
		this.filter2 = filter2;
	}

	public Object getFilter3() {
		return filter3;
	}

	public void setFilter3(Object filter3) {
		this.filter3 = filter3;
	}

	public Object getFilter4() {
		return filter4;
	}

	public void setFilter4(Object filter4) {
		this.filter4 = filter4;
	}

	public Object getFilter5() {
		return filter5;
	}

	public void setFilter5(Object filter5) {
		this.filter5 = filter5;
	}

	public Object getFilter6() {
		return filter6;
	}

	public void setFilter6(Object filter6) {
		this.filter6 = filter6;
	}

	public Object getFilter7() {
		return filter7;
	}

	public void setFilter7(Object filter7) {
		this.filter7 = filter7;
	}

	public Object getFilter8() {
		return filter8;
	}

	public void setFilter8(Object filter8) {
		this.filter8 = filter8;
	}

	public Object getFilter9() {
		return filter9;
	}

	public void setFilter9(Object filter9) {
		this.filter9 = filter9;
	}

	public Object getFilter10() {
		return filter10;
	}

	public void setFilter10(Object filter10) {
		this.filter10 = filter10;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	protected List<T> results; // 当前页记录List形式

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
		computeTotalPage();
	}

	public long getTotalRecord() {
		return totalRecord;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalRecord(long totalRecord) {
		this.totalRecord = totalRecord;
		computeTotalPage();
	}

	protected void computeTotalPage() {
		if (getPageSize() > 0 && getTotalRecord() > -1) {
			this.totalPage = (int) (getTotalRecord() % getPageSize() == 0 ? getTotalRecord() / getPageSize() : getTotalRecord() / getPageSize() + 1);
		}
	}

	public List<T> getResults() {
		return results;
	}

	public void setResults(List<T> results) {
		this.results = results;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder().append("Page [pageNo=").append(pageNo).append(", pageSize=").append(pageSize)
				.append(", totalRecord=").append(totalRecord < 0 ? "null" : totalRecord).append(", totalPage=")
				.append(totalPage < 0 ? "null" : totalPage).append(", curPageObjects=").append(results == null ? "null" : results.size()).append("]");
		return builder.toString();
	}

}
