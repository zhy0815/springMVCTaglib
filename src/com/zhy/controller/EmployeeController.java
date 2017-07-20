package com.zhy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zhy.model.Dept;
import com.zhy.model.Employee;

@Controller
public class EmployeeController {
	@RequestMapping(value="/checkBoxesForm3",method=RequestMethod.GET)
	public String checkBoxesForm3(Model model) {
		Employee employee=new Employee();
		Dept dept=new Dept(1, "开发部");
		List<Dept> list=new ArrayList<>();
		list.add(dept);
		employee.setDepts(list);
		List<Dept> depts=new ArrayList<>();
		depts.add(dept);
		depts.add(new Dept(2, "销售部"));
		depts.add(new Dept(3, "市场部"));
		model.addAttribute("employee", employee);
		model.addAttribute("depts", depts);
		return "checkBoxesForm3";
	}
}
