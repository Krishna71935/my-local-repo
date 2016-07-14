package com.flp.ems.service;

import java.util.HashMap;

import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;
import com.flp.ems.domain.Role;

public class EmployeeServiceImpl implements IEmployeeService {

	Employee employee = new Employee();
	Department department = new Department();
	Project project = new Project();
	Role role = new Role();
	
	@Override
	public void AddEmployee(HashMap hm) {
	
		employee.setName((String) hm.get("name"));
		employee.setAdr((String) hm.get("adr"));
		employee.setEmail((String) hm.get("email"));
		employee.setPh((String) hm.get("ph"));
		employee.setDob((String) hm.get("dob"));
		employee.setDoj((String) hm.get("doj"));
		department.setDept((String) hm.get("dept"));
		project.setPrj((String) hm.get("prj"));
		role.setRole((String) hm.get("role"));
	}

	
	
	
	@Override
	public void ModifyEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RemoveEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SearchEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAllEmployee() {
		// TODO Auto-generated method stub
		
	}

	

	
}
