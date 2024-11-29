package EmployeeWageComputation2;

import java.util.Random;

public class Employee {
public static void main(String[] args) {
	System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
	int Wage_Per_hours = 20;
	int Full_Day_Hours=8;
	int Part_Time_Hours=4;
	Random r1=new Random();
	int attendance=r1.nextInt(3);
    int dailyWage=0;
    switch(attendance) {
    case 0:
    	System.out.println("Employee is Absent");
    	dailyWage=0;
    	break;
    case 1:
    	System.out.println("Employee is working part-time ");
    	dailyWage = Wage_Per_hours * Part_Time_Hours;
    	break;
    case 2: 
    	System.out.println("Employee is working full-time");
    	break;
    	default:
    		System.out.println("Invalid  Attendance");
	}
    System.out.println("Daily Employee Wage:  "+dailyWage);
	}
}

