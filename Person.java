package collegelist;

/*
 * Name:        James Horton
 * Date:        11/06/2018
 * File:        Person.java
 */

/**
 *
 * @author Redindianfred
 */
public abstract0 class Person 
{
    protected String fName;
    protected String lName;
    protected String streetAddress;
    protected String zipCode;
    protected String phNum;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhNum() {
        return phNum;
    }

    public void setPhNum(String phNum) {
        this.phNum = phNum;
    }
    
    public Person(String fName, String lName, String address, String zip, String num)
    {
        this.fName = fName;
        this.lName = lName;
        this.streetAddress = address;
        this.zipCode = zip;
        this.phNum = num;
    } // end of full constructor
    
    public void display()
    {
        System.out.printf("Name: %s %s  Address: %s, %s  Phone Number: %s", fName, lName, streetAddress, zipCode, phNum);
    } // end of display person
    
} // end of Person
