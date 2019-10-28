package servingArea;

public abstract class Employees {
static int employeeId;
static String nameOfEmployee;
static int salary;

public void employeeDetails() {
	System.out.println(employeeId+":"+nameOfEmployee+"'s salary is" +salary);
}
}
