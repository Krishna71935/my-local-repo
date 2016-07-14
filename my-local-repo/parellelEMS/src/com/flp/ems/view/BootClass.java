package com.flp.ems.view;

import java.util.Scanner;

public class BootClass
{
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("Welcome...\nSelect the category\n");
			System.out.println("Add Employee (Press 1)\nModify Employee (Press 2)\n"
					+ "Remove Employee (Press 3)\n"
					+ "Search Employee (Press 4)\nView all Employees (Press 5)");
			
			menuSelection();
		}
		}
		
	public static UserInteraction ui = new UserInteraction();
	
	public static void menuSelection() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your selection\t");
		int i = sc.nextInt();
		
		switch(i){
		
		case 1:ui.addEmployee();			break;
		
		case 2: ui.modifyEmployee();		break;
		
		case 3: ui.removeEmployee();	break;
		
		case 4:ui. searchEmployee();		break;
		
		case 5: ui.getAllEmployee();		break;
		
		default: System.out.println("Invalid Selection");		
		
		}
		sc.close();
		
	}
}