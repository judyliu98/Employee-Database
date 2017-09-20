import java.util.*;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyHT {
    // attributes

    private final ArrayList<EmployeeInfo>[] buckets;

    // Constructor given numBuckets
    public MyHT(int numBuckets) {
        buckets = new ArrayList[numBuckets];
        for (int i = 0; i < numBuckets; i++) {
            buckets[i] = new ArrayList<>();
        }
    }//Constructor

    public int calcBucket(int keyValue) {
        if (keyValue % buckets.length < 0) {
            return (keyValue % buckets.length + buckets.length);
        } else {
            return (keyValue % buckets.length);
        }
    }//calcBucket

    public boolean addToTable(EmployeeInfo someEmp) {
        return (buckets[calcBucket(someEmp.getEmployeeNumber())].add(someEmp));
    }//addToTable

    // Search using only employeeNumber, return index of list employee is in, or
    // -1 if not in list
    public int searchTable(int employeeNumber) {
        int bucket = calcBucket(employeeNumber);
        for (int i = 0; i < buckets[calcBucket(employeeNumber)].size(); i++) {
            if (employeeNumber == ((buckets[calcBucket(employeeNumber)].get(i)).getEmployeeNumber())) {
                return i;
            }
        }
        return -1;
    }//searchTable

    // Remove using only employeeNumber
    public EmployeeInfo removeFromTable(int employeeNumber) {
        int index = searchTable(employeeNumber);
        if (index == -1) {
            return null;
        } else {
            return buckets[calcBucket(employeeNumber)].remove(index);
        }
    }//removeFromTable

    // Display everything in the table
    public void displayTable() {
        PrintWriter out = null;
        try {
            out = new PrintWriter("Data.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MyHT.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < buckets.length; i++) {
            if (buckets[i].isEmpty()) {
            } else {
                for (int j = 0; j < buckets[i].size(); j++) {
                    out.print(buckets[i].get(j).getEmployeeNumber() + " ");
                    out.print(buckets[i].get(j).getFirstName() + " ");
                    out.print(buckets[i].get(j).getLastName() + " ");
                    out.print(buckets[i].get(j).getDeductionsRate() + " ");
                    out.print(buckets[i].get(j).getWorkLocation() + " ");
                    if (buckets[i].get(j) instanceof FullTimeEmployee) {
                        out.print("F ");
                        out.println(((FullTimeEmployee) buckets[i].get(j)).getAnnualSalary());
                    }//If FullTime
                    else if (buckets[i].get(j) instanceof PartTimeEmployee) {
                        out.print("P ");
                        out.print(((PartTimeEmployee) buckets[i].get(j)).getHourlyWage() + " ");
                        out.print(((PartTimeEmployee) buckets[i].get(j)).getHoursPerWeek() + " ");
                        out.println(((PartTimeEmployee) buckets[i].get(j)).getWeeksPerYear());
                    }//If PartTime
                }//For each emp in the bucket
            }//else
        }//For each bucket
        out.close();
    }//displayTable

    public ArrayList<EmployeeInfo>[] getBuckets() {
        return buckets;
    }
}
