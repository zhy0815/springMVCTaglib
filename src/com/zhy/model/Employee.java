package com.zhy.model;

import java.io.Serializable;
import java.util.List;

public class Employee implements Serializable {
	private List<Dept> depts;

	public Employee() {
		super();
	}

	public List<Dept> getDepts() {
		return depts;
	}

	public void setDepts(List<Dept> depts) {
		this.depts = depts;
	}
}
