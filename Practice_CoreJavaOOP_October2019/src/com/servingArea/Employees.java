package com.servingArea;

public abstract class Employees {
static int employeeId;
static String nameOfEmployee;
static int salary;

public static int getEmployeeId() {
	return employeeId;
}

public static void setEmployeeId(int employeeId) {
	Employees.employeeId = employeeId;
}

public static String getNameOfEmployee() {
	return nameOfEmployee;
}

public static void setNameOfEmployee(String nameOfEmployee) {
	Employees.nameOfEmployee = nameOfEmployee;
}

public static int getSalary() {
	return salary;
}

public static void setSalary(int salary) {
	Employees.salary = salary;
}



public void employeeDetails() {
	System.out.println(employeeId+":"+nameOfEmployee+"'s salary is" +salary);
}
}

class Chef extends Employees implements Register{

	@Override
	public void receiveMoney() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printReceipt() {
		// TODO Auto-generated method stub
		
	}

	
	
	

	
	}
	
	
