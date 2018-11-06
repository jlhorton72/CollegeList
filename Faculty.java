/*
 * Name:        James Horton
 * Date:        11/06/2018
 * File:        Faculty.java
 */
package collegelist;

/**
 *
 * @author Redindianfred
 */
public class Faculty extends CollegeEmployee
{
    protected boolean tenured;

    public boolean isTenured() {
        return tenured;
    }

    public void setTenured(boolean tenured) {
        this.tenured = tenured;
    }
    
    
    public Faculty(String fName, String lName, String address, String zip, String num, String ssn, double sal, String department, boolean tenured)
    {
        super(fName, lName, address, zip, num, ssn, sal, department);
        this.tenured = tenured;
    } // end of constructor
    
    @Override
    public void display()
    {
        System.out.println("Seriously, What goes here?");
    } // end of display
    
} // end of class Faculty
