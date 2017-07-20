package com.zhy.model;

import java.io.Serializable;
import java.util.List;

public class Reader implements Serializable {
	private boolean reader;
	private List<String> courses;
	public Reader() {
		super();
	}
	public boolean isReader() {
		return reader;
	}
	public void setReader(boolean reader) {
		this.reader = reader;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
}
