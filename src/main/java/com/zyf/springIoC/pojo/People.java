package com.zyf.springIoC.pojo;

import java.io.Serializable;

public class People implements Serializable {
	private static final long serialVersionUID = 5757533370646489413L;
	private int id;
	private String name;
	private String note;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
