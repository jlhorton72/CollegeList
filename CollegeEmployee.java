/*
 * Name:        James Horton
 * Date:        11/06/2018
 * File:        CollegeEmployee.java
 */
package collegelist;

/**
 *
 * @author Redindianfred
 */
public class CollegeEmployee extends Person
{
    protected String ssn;
    protected double salary;
    protected String department;

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    public CollegeEmployee(String fName, String lName, String address, String zip, String num, String ssn, double sal, String department)
    {
        super(fName, lName, address, zip, num);
        this.ssn = ssn;
        this.salary = sal;
        this.department = department;
    } // end of employee constructor
    
    @Override
    public void display()
    {
        System.out.println("What goes here?");
    } // end of display
    
    
    
} // end of class collegeEmployee
