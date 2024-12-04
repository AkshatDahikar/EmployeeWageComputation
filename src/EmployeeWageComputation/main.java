package EmployeeWageComputation;

public class main {

	public static void main(String[] args) {
		  EmployeeAttendance employeeAttendance = new EmployeeAttendance();
	        CalculateEmployeeWage calculateEmployeeWage = new CalculateEmployeeWage();
	                int attendance=employeeAttendance.getAttendance();
	              calculateEmployeeWage.calculateEmployeeWage(attendance);
	}

}
