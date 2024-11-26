package EmployeeWageComputation;

import java.util.Random;

public class Employee {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program on master branch");
		final int Wage_Per_Hours=20;
		final int Full_Day_Hours=8;
		final int Part_Time_Hours=4;
		final int Working_Days_In_Month=20; 
		Random r1=new Random();
		int totalMonthlyWage=0;
		for(int day=1 ;day <= Working_Days_In_Month;day++) {
		int attendance=r1.nextInt(3);
	    int dailyWage=0;
	    switch(attendance) {
	    case 0:
	    	System.out.println("Day"+day+": Employee is Absent");
	    	dailyWage=0;
	    	break;
	    case 1:
	    	System.out.println("Day"+day+": Employee is working part-time ");
	    	dailyWage =Wage_Per_Hours*Part_Time_Hours;
	    	break;
	    case 2: 
	    	System.out.println("Day"+day+"Employee is working full-time");
	    	dailyWage =Wage_Per_Hours*Full_Day_Hours;
	    	break;
	    	default:
	    		
	    		System.out.println("Invalid Attendance ");
	    }
	    totalMonthlyWage =totalMonthlyWage+dailyWage;
		}
	    System.out.println("Total Monthly Employee Wage : "+ totalMonthlyWage);
	    
		}
	}


