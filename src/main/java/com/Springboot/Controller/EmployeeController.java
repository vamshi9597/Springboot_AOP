package com.Springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Springboot.Service.Employeeservice;

@RestController
public class EmployeeController {
	@Autowired
	Employeeservice empser;
	@GetMapping("/emp/add")
	//@RequestMapping(value = "/emp/add" ,method =  RequestMethod.GET)
	public com.Springboot.Model.Employee addemployee(@RequestParam("Empname")String Empname,@RequestParam("Empid")int Empid)   
	{   
		return empser.create(Empname,101);
		
	}
	@GetMapping("/remove/emp")
	//@RequestMapping(value = "/remove/emp",method = RequestMethod.GET)
	public String removeemployee() {
		return "employee remeoved";
		
	}
	

}
