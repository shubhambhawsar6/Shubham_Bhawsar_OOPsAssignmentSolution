package com.greatlearning.Superdepartment;

import com.greatlearning.AdminDepartment.Admin_Department;
import com.greatlearning.HrDepartment.HR_Department;
import com.greatlearning.TechDepartment.Tech_Department;

public class Super_Department {
	
	public static void main(String[] args) {
		
		Admin_Department AD=new Admin_Department();
		
		
		System.out.println("Welcome to "+AD.departmentName());
		System.out.println(AD.getTodaysWork());
		System.out.println(AD.getWorkDeadline());
		System.out.println("Today is not Holiday");
		System.out.println(" \n");
		
		HR_Department HR=new HR_Department();
		
		System.out.println("Welcome to "+HR.departmentName());
		System.out.println(HR.getTodaysWork());
		System.out.println(HR.getWorkDeadline());
		System.out.println(HR.doActivity());
		System.out.println("Today is not Holiday");
		System.out.println("\n");
		
		Tech_Department Tech=new Tech_Department();
		
		System.out.println("Welcome to "+Tech.departmentName());
		System.out.println(Tech.getTodaysWork());
		System.out.println(Tech.getWorkDeadline());
		System.out.println(Tech.getTechStackInformation());
		System.out.println("Today is not Holiday");
		System.out.println("\n");
	}

}
