/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class PartTimeEmployee extends EmployeeInfo {

	// Attributes
	private double hourlyWage;
	private double hoursPerWeek;
	private double weeksPerYear;

	// Constructor with no PartTime data
	public PartTimeEmployee(int employeeNumber, String firstName, String lastName,
                double deductionsRate,int workLocation) {
		super(employeeNumber, firstName, lastName, deductionsRate, workLocation);
		hourlyWage=0;
                hoursPerWeek=0;
                weeksPerYear=0;
	}

	// Constructor with all data
	public PartTimeEmployee(int employeeNumber, String firstName, String lastName,
                double deductionsRate, int workLocation, double hourlyWage,
                double hoursPerWeek, double weeksPerYear) {
		super(employeeNumber, firstName, lastName, deductionsRate,workLocation);
                this.hourlyWage=hourlyWage;
                this.hoursPerWeek=hoursPerWeek;
                this.weeksPerYear=weeksPerYear;
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public double getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(double hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	public double getWeeksPerYear() {
		return weeksPerYear;
	}

	public void setWeeksPerYear(double weeksPerYear) {
		this.weeksPerYear = weeksPerYear;
	}

	public double calcYearlyNetIncome() {
		return hourlyWage*hoursPerWeek*weeksPerYear*(1-deductionsRate);
	}

}
