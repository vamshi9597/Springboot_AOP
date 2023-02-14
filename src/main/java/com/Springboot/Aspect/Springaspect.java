package com.Springboot.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class Springaspect {
	public class EmployeeServiceAspect   
	{  
	@Before(value = "execution(* com.Springboot.service.EmployeeService.*(..)) and args(EmpId, Empname)")  
	public void beforeAdvice(JoinPoint joinPoint, String EmpID, String EmpNAME) {  
	System.out.println("Before method:" + joinPoint.getSignature());  
	System.out.println("Creating Employee with name - "  +EmpNAME+ " and id - " + EmpID);  
	}  
	}  
}
