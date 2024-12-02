package EmployeeWageComputation;

import java.util.Random;

public class Employee {
		
		private static final int WAGE_PER_HOUR = 0;
	
		public static void main(String[] args) {
	        System.out.println("Welcome to Employee Wage Computation Program!");
	        Employee employee = new Employee();
	        employee.computeEmployeeWage("Company A", 20, 10, 100);
	        employee.computeEmployeeWage("Company B", 25, 12, 90);
	        }
		public void computeEmployeeWage(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
	        int totalWorkingHours = 0;
	        int totalWorkingDays = 0;
	        int totalMonthlyWage = 0;

	        Random random = new Random();
	        System.out.println("\nComputing wages for " + companyName + ":");

	        while (totalWorkingHours < maxWorkingHours && totalWorkingDays < maxWorkingDays) {
			totalWorkingDays++;
		int attendance=random.nextInt(3);
		   int dailyHours = calculateDailyHours(attendance, totalWorkingDays);;
	    totalWorkingHours += dailyHours;
        totalMonthlyWage += WAGE_PER_HOUR * dailyHours;
        if (totalWorkingHours > maxWorkingHours) {
            dailyHours -= (totalWorkingHours - maxWorkingHours);
            totalWorkingHours = maxWorkingHours;
        }

        totalMonthlyWage += wagePerHour * dailyHours;

        if (totalWorkingHours >= maxWorkingHours) {
            System.out.println("Maximum working hours limit reached for " + companyName + ".");
            break;
        }
    }

    displayResults(companyName, totalWorkingDays, totalWorkingHours, totalMonthlyWage);
}
    
		  private int calculateDailyHours(int attendance,int day) {
			  final int Full_Day_Hours = 8;
		        final int Part_Time_Hours = 4;
		        switch (attendance) {
	            case 0:
	                System.out.println("Day " + day + ": Employee is Absent");
	                return 0;
	            case 1:
	                System.out.println("Day " + day + ": Employee is working part-time");
	                return Part_Time_Hours;
	            case 2:
	                System.out.println("Day " + day + ": Employee is working full-time");
	                return Full_Day_Hours;
	            default:
	                System.out.println("Day " + day + ": Invalid Attendance Type");
	                return 0;
	        }
	    }
		  public void displayResults(String companyName, int totalWorkingDays, int totalWorkingHours, int totalMonthlyWage) {
		     
				System.out.println("Summary of Employee Wage Computation for:"+companyName + ":");
		        System.out.println("Total Working Days: " + totalWorkingDays);
		        System.out.println("Total Working Hours: " + totalWorkingHours);
		        System.out.println("Total Monthly Wage: " + totalMonthlyWage);
		    }
		}
		


