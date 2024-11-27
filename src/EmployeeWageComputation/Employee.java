package EmployeeWageComputation;

import java.util.Random;

public class Employee {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program on master branch");
		final int Wage_Per_Hours=20;
		final int Full_Day_Hours=8;
		final int Part_Time_Hours=4;
		final int Max_Working_Hours=100;
		final int Max_Working_Days=10; 
		Random r1=new Random();
		int totalWorkingHours =0;
		int totalWorkingDays=0;
		int totalMonthlyWage=0;
		while(totalWorkingHours < Max_Working_Hours && totalWorkingDays < Max_Working_Days) {
			totalWorkingDays++;
		int attendance=r1.nextInt(3);
	    int dailyHours=0;
	    switch(attendance) {
	    case 0:
	    	System.out.println("Day"+totalWorkingDays+": Employee is Absent");
	    	dailyHours=0;
	    	break;
	    case 1:
	    	System.out.println("Day"+totalWorkingDays+": Employee is working part-time ");
	    	dailyHours =Part_Time_Hours;
	    	break;
	    case 2: 
	    	System.out.println("Day"+totalWorkingDays+"Employee is working full-time");
	    	dailyHours =Full_Day_Hours;
	    	break;
	    	default:
	    		
	    		System.out.println("Invalid Attendance Type");
	    }
	    totalWorkingHours =totalWorkingHours+dailyHours;
	    int dailyWage=Wage_Per_Hours * dailyHours;
	    totalMonthlyWage =totalMonthlyWage + dailyWage;
	    if(totalWorkingHours >= Max_Working_Hours) {
	    	System.out.println("Maximum working hours limit reached");
	    	break;
	    }
		}
		System.out.println("Total Working Days: "+totalWorkingDays);
		System.out.println("Total Working Hours: "+totalWorkingHours);
	    System.out.println("Total Monthly  Wage : "+ totalMonthlyWage);
	    
		}
	}


