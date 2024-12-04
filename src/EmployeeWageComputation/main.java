package EmployeeWageComputation;

public class main {

	public static void main(String[] args) {
	    System.out.println("Welcome to Employee Wage Computation");
		  EmployeeAttendance employeeAttendance = new EmployeeAttendance();
	        CalculateEmployeeWage calculateEmployeeWage = new CalculateEmployeeWage();
	                int attendance = employeeAttendance.getAttendance(); 
	              calculateEmployeeWage.calculateEmployeeWage(attendance);
	}

}
