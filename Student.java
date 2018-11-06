/*
 * Name:        James Horton
 * Date:        11/06/2018
 * File:        Student.java
 */
package collegelist;

/**
 *
 * @author Redindianfred
 */
public class Student extends Person 
{
    protected String major;
    protected double gpa;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    
    public Student(String fName, String lName, String address, String zip, String num,String major, double gpa)
    {
        super(fName, lName, address, zip, num);
        this.major = major;
        this.gpa = gpa;        
    } // end of student
    
    @Override
    public void display()
    {
        System.out.println("Seriously, Why?");
    } // end of display
    
    
} // end of student
