/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
public class EmployeeInfo // For DataBase
{

	// Attributes

	protected int employeeNumber;
	protected String firstName;
	protected String lastName;
	protected double deductionsRate;
	protected int workLocation; //1: Mississauga, 2: Ottawa, 3: Boston

	// Constructor to assign passed values to attributes
	public EmployeeInfo(int employeeNumber, String firstName, String lastName, double deductionsRate, int workLocation) {
		this.employeeNumber = employeeNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.deductionsRate = deductionsRate;
                this.workLocation=workLocation;
	}

	// Getter method for employeeNumber attribute.
	public int getEmployeeNumber() {
		return (employeeNumber);
	}

	// Setter method for employeeNumber attributes.
	public void setEmployeeNumber(int empNo) {
		if (empNo < 0) {
		} else {
			employeeNumber = empNo;
		}
	}

	// Getter method for firstName
	public String getFirstName() {
		return (firstName);
	}

	// Setter method for firstName attribute.
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// Getter method for lastName
	public String getLastName() {
		return (lastName);
	}

	// Setter method for lastName.
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// Getter method for deductionRate
	public double getDeductionsRate() {
		return deductionsRate;
	}

	// Setter method for deductionRate
	public void setDeductionsRate(double deductionRate) {
		this.deductionsRate = deductionRate;
	}

        // Getter method for workLocation
	public int getWorkLocation() {
		return workLocation;
	}

	// Setter method for workLocation
	public void setWorkLocation(int workLocation) {
		this.workLocation = workLocation;
	}
} // public class EmployeeInfo
