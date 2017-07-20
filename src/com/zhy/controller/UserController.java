package com.zhy.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zhy.model.Dept;
import com.zhy.model.User;
import com.zhy.util.UserValidator;

@Controller
public class UserController {
	@RequestMapping(value="/registerForm",method=RequestMethod.GET)
	public String registerForm(Model model) {
		User user=new User("zhy", "男", 24);
		model.addAttribute("command", user);
		return "registerForm";
	}
	@RequestMapping(value="/registerForm2",method=RequestMethod.GET)
	public String registerForm2(Model model) {
		User user=new User("张翰以", "女", 35);
		model.addAttribute("user", user);
		return "registerForm2";
	}
	@RequestMapping(value="/radioButtonForm",method=RequestMethod.GET)
	public String radioButtonForm(Model model) {
		User user=new User();
		user.setSex("男");
		model.addAttribute("user", user);
		return "radioButtonForm";
	}
	@RequestMapping(value="/radioButtonsForm",method=RequestMethod.GET)
	public String radioButtonsForm(Model model) {
		User user=new User();
		user.setSex("女");
		List<String> sexList=new ArrayList<>();
		sexList.add("男");
		sexList.add("女");
		model.addAttribute("user", user);
		model.addAttribute("sexlist", sexList);
		return "radioButtonsForm";
	}
	@RequestMapping(value="/radioButtonsForm2",method=RequestMethod.GET)
	public String radioButtonsForm2(Model model) {
		User user=new User();
		user.setSex("1");
		Map<String, String> sexMap=new HashMap<>();
		sexMap.put("1", "猪");
		sexMap.put("2", "狗");
		sexMap.put("3", "驴");
		model.addAttribute("user", user);
		model.addAttribute("sexMap", sexMap);
		return "radioButtonsForm2";
	}
	@RequestMapping(value="/selectForm",method=RequestMethod.GET)
	public String selectForm(Model model) {
		User user=new User();
		user.setDeptId(2);
		model.addAttribute("user", user);
		return "selectForm";
	}
	@RequestMapping(value="/selectForm2",method=RequestMethod.GET)
	public String selectForm2(Model model) {
		User user=new User();
		user.setDeptId(3);
		Map<Integer, String> deptMap=new HashMap<>();
		deptMap.put(1, "猪");
		deptMap.put(2, "狗");
		deptMap.put(3, "毛");
		model.addAttribute("user", user);
		model.addAttribute("deptMap", deptMap);
		return "selectForm2";
	}
	@RequestMapping(value="/selectForm3",method=RequestMethod.GET)
	public String selectForm3(Model model) {
		User user=new User();
		user.setDeptId(1);
		List<Dept> deptlist=new ArrayList<>();
		deptlist.add(new Dept(1, "ji"));
		deptlist.add(new Dept(2, "鸭"));
		deptlist.add(new Dept(3, "鱼"));
		model.addAttribute("user", user);
		model.addAttribute("deptList", deptlist);
		return "selectForm3";
	}
	@RequestMapping(value="/registerForm3",method=RequestMethod.GET)
	public String registerForm3(Model model) {
		User user=new User();
		model.addAttribute("user", user);
		return "registerForm3";
	}
	@InitBinder
	public void initBinder(DataBinder binder) {
		binder.setValidator(new UserValidator());
	}
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String register(@Validated User user,Errors errors) {
		if(errors.hasFieldErrors()){
			return "registerForm3";
		}
		return "submit";
	}
}
