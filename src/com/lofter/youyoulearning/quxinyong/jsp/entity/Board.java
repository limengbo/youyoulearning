package com.lofter.youyoulearning.quxinyong.jsp.entity;

public class Board {
	private Integer id;
	private String Title;
	private Integer parentId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	@Override
	public String toString() {
		return "Board [id=" + id + ", Title=" + Title + ", parentId="
				+ parentId + "]";
	}

}
