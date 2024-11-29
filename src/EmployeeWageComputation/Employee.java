package EmployeeWageComputation;

import java.util.Random;

public class Employee {
		
		private static final int WAGE_PER_HOUR = 0;
		final int Wage_Per_Hours=20;
		final int Full_Day_Hours=8;
		final int Part_Time_Hours=4;
		final int Max_Working_Hours=100;
		final int Max_Working_Days=10;
		int totalWorkingHours =0;
		int totalWorkingDays=0;
		int totalMonthlyWage=0;
		public static void main(String[] args) {
	        System.out.println("Welcome to Employee Wage Computation Program!");
	        Employee employee = new Employee();
	        employee.computeEmployeeWage();
	        employee.displayResults();
	        }
		 public void computeEmployeeWage() {
		        Random random = new Random();
		while(totalWorkingHours < Max_Working_Hours && totalWorkingDays < Max_Working_Days) {
			totalWorkingDays++;
		int attendance=random.nextInt(3);
	    int dailyHours=calculateDailyHours(attendance);
	    totalWorkingHours += dailyHours;
        totalMonthlyWage += WAGE_PER_HOUR * dailyHours;
        if (totalWorkingHours >= Max_Working_Hours) {
            System.out.println("Maximum working hours limit reached.");
            break;
        }
    }
}
		  private int calculateDailyHours(int attendance) {
	    switch(attendance) {
	    case 0:
	    	System.out.println("Day"+totalWorkingDays+": Employee is Absent");
	        return 0;
	    case 1:
	    	System.out.println("Day"+totalWorkingDays+": Employee is working part-time ");
	    	return  Part_Time_Hours;
	    case 2: 
	    	System.out.println("Day"+totalWorkingDays+"Employee is working full-time");
	    	return Full_Day_Hours;
	    	default:
	    		
	    		System.out.println("Invalid Attendance Type");
	    		return 0;
	    }}
		  public void displayResults() {
		        System.out.println("\nSummary of Employee Wage Computation:");
		        System.out.println("Total Working Days: " + totalWorkingDays);
		        System.out.println("Total Working Hours: " + totalWorkingHours);
		        System.out.println("Total Monthly Wage: " + totalMonthlyWage);
		    }
		}
		


