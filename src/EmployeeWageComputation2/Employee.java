package EmployeeWageComputation2;

import java.util.Random;

public class Employee {
public static void main(String[] args) {
	System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
	Random r1=new Random();
	int attendance=r1.nextInt(2);
	if(attendance == 1) {
		System.out.println("Employee is present ");
	}else {
		System.out.println("Employee is absent ");
	}
	}
}

