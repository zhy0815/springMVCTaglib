package com.zhy.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zhy.model.Reader;

@Controller
public class ReaderController {
	@RequestMapping(value="/checkBoxForm",method=RequestMethod.GET)
	public String checkBoxForm(Model model) {
		Reader reader=new Reader();
		reader.setReader(true);
		List<String> list=new ArrayList<>();
		list.add("JavaEE");
		list.add("Spring");
		reader.setCourses(list);
		model.addAttribute("reader", reader);
		return "checkBoxForm";
	}
	@RequestMapping(value="/checkBoxesForm",method=RequestMethod.GET)
	public String checkBoxesForm(Model model) {
		Reader reader=new Reader();
		List<String> list=new ArrayList<>();
		list.add("JavaEE");
		list.add("Spring");
		reader.setCourses(list);
		List<String> coursesList=new ArrayList<>();
		coursesList.add("JavaEE");
		coursesList.add("Spring");
		coursesList.add("Hibnerbate");
		coursesList.add("Struts2");
		model.addAttribute("reader", reader);
		model.addAttribute("coursesList", coursesList);
		return "checkBoxesForm";
	}
	@RequestMapping(value="/checkBoxesForm2",method=RequestMethod.GET)
	public String checkBoxesForm2(Model model) {
		Reader reader=new Reader();
		List<String> list=new ArrayList<>();
		list.add("1");
		list.add("2");
		reader.setCourses(list);
		Map<String, String> courseMap=new HashMap<>();
		courseMap.put("1", "JavaEE");
		courseMap.put("2", "Spring");
		courseMap.put("3", "Mybatis");
		model.addAttribute("reader", reader);
		model.addAttribute("courses", courseMap);
		return "checkBoxesForm2";
	}
}
