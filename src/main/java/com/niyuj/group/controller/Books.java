package com.niyuj.group.controller;

public class Books {
	private String name;

	private String category;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Books(String name, String category) {
		super();
		this.name = name;
		this.category = category;
	}

	public Books() {

	}

	@Override
	public String toString() {
		return name + " " + category;
	}

}
