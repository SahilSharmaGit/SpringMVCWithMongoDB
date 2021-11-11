package com.atmax.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.atmax.model.AtmaxEmployee;
import com.atmax.service.AtmaxService;

@Controller
public class AtmaxController {

	@Autowired
	AtmaxService service;

	@GetMapping("/details")
	public String getDetails() {
		return "details";
	}

	@GetMapping("/home")
	public String getHome()
	{
		return "home";
	}
	
	@GetMapping("/optr")
	public String doDml() {
		return "operations";
	}

	@RequestMapping("/save")
	public ModelAndView saveEmp(@ModelAttribute("emp") AtmaxEmployee emp) {

		service.insert(emp);
		String name = emp.getName();
		//ModelAndView m = new ModelAndView();
		//m.addObject("msg", "Employee inserted Successfully!!!");
		return new ModelAndView("insert","msg", "Employee "+ name +" inserted Successfully!!!");
	}

	@RequestMapping("/update")
	public ModelAndView updateEmp(@ModelAttribute("emp") AtmaxEmployee emp) {
		service.update(emp);
		ModelAndView m = new ModelAndView();
		m.addObject("msg", "Employee Updated Successfully!!!");
		return new ModelAndView("update","msg", "Employee updated Successfully!!!");
	}

	@RequestMapping("/delete")
	public ModelAndView deleteEmp(HttpServletRequest req) {

		String email = req.getParameter("email");
		service.delete(email);

		return new ModelAndView("delete","msg", "Employee deleted Successfully!!!");
	}

	@RequestMapping("/all")
	public ModelAndView getAllEmps() {
		List<AtmaxEmployee> data = service.selectAll();
		return new ModelAndView("allRecords", "data", data);
	}

	@RequestMapping("/one")
	public ModelAndView getSingleRecord(HttpServletRequest req) {
		String email = req.getParameter("email");
		List<AtmaxEmployee> data = service.select(email);
		return new ModelAndView("single", "data", data);
	}
}