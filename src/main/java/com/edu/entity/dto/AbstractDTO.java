package com.edu.entity.dto;

public class AbstractDTO {

	private Integer pageSize;
	private Integer pageNum;

	public int getPageSize() {
		if(this.pageSize == null){
			return 0;
		}
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNum() {
		if(this.pageNum == null){
			return 0;
		}
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

}
