package com.Springboot.Service;

import org.springframework.stereotype.Service;

import com.Springboot.Model.Employee;
@Service
public class Employeeservice {
	public Employee create(String EmpNAME,int EmpID) {
		Employee emp=new Employee();
		emp.setEmpid(EmpID);
		emp.setEmpname(EmpNAME);
		return emp;}
	public void deleteemployee() {
		
	}

}
