package com.vp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vp.model.Emp;
import com.vp.service.EmpService;
@Controller
public class EmpController {
	@Autowired
	EmpService empservice;
	@RequestMapping("/home")
    String home() {
    	
    	return "home";
    }
	@RequestMapping("/listEmps")
	String getEmp(Model model) {
		List<Emp> list =empservice.getAllEmp();
		model.addAttribute("list", list);
		
		return "listemps";
	}
	@RequestMapping("/form")
	String getForm(Model model) {
		
		model.addAttribute("emp", new Emp());
		
		return "Form";
	}
	
	@PostMapping("/saveEmp")
	String saveTeacher(@ModelAttribute("emp") Emp emp) {
		
		empservice.saveOrUpdate(emp);
		return "redirect:/listEmps";
	}
}
