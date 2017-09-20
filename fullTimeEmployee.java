public class FullTimeEmployee extends EmployeeInfo {

    // Attributes
    private double annualSalary;

    // Constructor with no FullTime data
    public FullTimeEmployee(int employeeNumber, String firstName, String lastName, double deductionsRate,
            int workLocation) {
        super(employeeNumber, firstName, lastName, deductionsRate, workLocation);
        this.annualSalary = 0;
    }

    // Constructor with all data
    public FullTimeEmployee(int employeeNumber, String firstName, String lastName, double deductionsRate,
            int workLocation, double annualSalary) {
        super(employeeNumber, firstName, lastName, deductionsRate, workLocation);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double calcYearlyNetIncome() {
        return annualSalary * (1 - deductionsRate);
    }

}
