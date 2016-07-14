package com.flp.ems.view;

import java.util.HashMap;
import java.util.Scanner;

import com.flp.ems.service.EmployeeServiceImpl;
import com.flp.ems.service.IEmployeeService;
import com.flp.ems.util.Validate;

public class UserInteraction {

		IEmployeeService empserv = new EmployeeServiceImpl();
		Validate valid = new Validate();
		HashMap<String, String> hm = new HashMap<String, String>();

		String id, dept, prj, role;
				
		public void addEmployee() {
			Scanner s = new Scanner(System.in);
			
			System.out.println("Employee Name:\t");				// EMPLOYEE NAME
			String name = s.next();
			hm.put("name", name);
						
			System.out.println("Address:\t");					// ADDRESS
			String adr = s.next();
			hm.put("adr", adr);
						
			System.out.println("Email:\t");						// EMAIL
			String email = s.next();
			hm.put("email", email);
						
			System.out.println("Phone number:\t");				// MOBILE NUMBER
			String ph = s.next();
			hm.put("ph", ph);
						
			System.out.println("Date of Birth:\t");				// DOB
			String dob = s.next();
			boolean bool = valid.valid_Date(dob);
						
			System.out.println("Date of Joining:\t");			// DOJ
			String doj = s.next();
			boolean boole = valid.valid_Date(doj);
						
			if(bool && boole) {									// VALIDATION OF DATE
				hm.put("dob", dob);
				hm.put("doj", doj);
			}
			
			System.out.println("Enter Kin ID (5 digit):\t");	// KIN ID
			id = s.next();
			hm.put("id", id);
			
			System.out.println("Select the Department...");		// SELECTING DEPARTMENT
			System.out.println("1. ADM (Press 1)\t2. MAINFRAMES (press 2)\t3. CARDS (press 3)");
			int i = s.nextInt();
			switch(i) {
			case 1: dept = "ADM"; break;
			case 2: dept = "MAINFRAMES"; break;
			case 3: dept = "CARDS"; break;
			default: System.out.println("Invalid selection");
			}
			hm.put("dept", dept);
			
			
			System.out.println("Select the Project...");		// SELECTING PROJECT
			System.out.println("1. MORGAN STANLEY\t2. BARCLAYS\t3. IBM");
			int j = s.nextInt();
			switch(j) {
			case 1: prj = "MORGAN STANLEY"; break;
			case 2: prj = "BARCLAYS"; break;
			case 3: prj = "IBM"; break;
			default: System.out.println("Invalid selection");
			}
			hm.put("prj", prj);
			
			System.out.println("Select the role...");			// SELECTING ROLE
			System.out.println("1. SOFTWARE ENGINEER\t2. CONSULTANT\t3. SENIOR CONSULTANT");
			int k = s.nextInt();
			switch(k) {
			case 1: role = "SOFTWARE ENGINEER"; break;
			case 2: role = "CONSULTANT"; break;
			case 3: role = "SENIOR CONSULTANT"; break;
			default: System.out.println("Invalid selection");
			}
			hm.put("role", role);
			s.close();
			empserv.AddEmployee(hm);
		}
		
		
		
		public void modifyEmployee() {
			
		}
		
		public void removeEmployee() {
			
		}
		
		public void searchEmployee() {
			
		}
		
		public void getAllEmployee() {
			
		}
}

