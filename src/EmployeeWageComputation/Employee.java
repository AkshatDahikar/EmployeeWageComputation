package EmployeeWageComputation;

import java.util.Random;

public class Employee {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program on master branch");
		int Wage_Per_Hours=20;
		int Full_Day_Hours=8;
		Random r1=new Random();
		int attendance=r1.nextInt(2);
		if(attendance == 1) {
			System.out.println("Employee is present");
			int dailyEmployeeWage=Wage_Per_Hours*Full_Day_Hours;
			System.out.println("Daily Employee Wage:"+dailyEmployeeWage);
		}else {
			System.out.println("Employee is absent");
			System.out.println("Daily Employee Wage: 0");
		}
	}

}
