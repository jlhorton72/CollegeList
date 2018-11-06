/*
 * Name:        James Horton
 * Date:        11/06/2018
 * File:        CollegeList.java
 */
package collegelist;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Redindianfred
 */
public class CollegeList 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       ArrayList<Person> people = new ArrayList<Person>();
       String fnm;
       String lnm;
       String addrss;
       String zip;
       String num;
       String ssn;
       double sal;
       String dept;
       boolean tnre;
       String maj;
       double gpa;
       
       String flag = "";
       Scanner sc = new Scanner(System.in);
       while(!"Q".equals(flag))
       {
           System.out.println("Which type of person (C, F, S, or Q to quit): ");
           String input = sc.nextLine();
           if (!"Q".equals(input))
           {
                // need below code separate
                System.out.println("What is first name: ");
                fnm = sc.nextLine();
                System.out.println("What is last name: ");
                lnm = sc.nextLine();
                System.out.println("What is street address: ");
                addrss = sc.nextLine();
                System.out.println("What is zip code: ");
                zip = sc.nextLine();
                System.out.println("What is phone number: ");
                num = sc.nextLine();

                if ("C".equals(input))
                {
                    System.out.println("What is ssn: ");
                    ssn = sc.nextLine();
                    System.out.println("What is salary: ");
                    sal = sc.nextDouble();
                    System.out.println("What is department: ");
                    dept = sc.nextLine();

                    CollegeEmployee col = new CollegeEmployee(fnm, lnm, addrss, zip, num, ssn, sal, dept);
                    people.add(col);
                } // end of if

                if ("F".equals(input))
                {
                    System.out.println("What is ssn: ");
                    ssn = sc.nextLine();
                    System.out.println("What is salary: ");
                    sal = sc.nextDouble();
                    String y = sc.nextLine();
                    System.out.println("What is department: ");
                    dept = sc.nextLine();
                    System.out.println("Are they tenured: (Y or N) ");
                    String in2 = sc.nextLine();
                    if ("Y".equals(in2))
                    {
                        tnre = true;
                    } // end of if for bool
                    if ("N".equals(in2))
                    {
                        tnre = false;
                    } // end of if for bool
                    else
                    {
                        tnre = false;
                        System.out.println("Bad input! Will set tenure to NOT!");
                    } // default for resolution  

                    Faculty fac = new Faculty (fnm, lnm, addrss, zip, num, ssn, sal, dept, tnre);
                    people.add(fac);

                } // end of if

                if ("S".equals(input))
                {                    
                    System.out.println("What is gpa: ");
                    gpa = sc.nextDouble();
                    String y = sc.nextLine();
                    System.out.println("What is the major: ");
                    maj = sc.nextLine();
                    Student stu = new Student (fnm, lnm, addrss, zip, num, maj, gpa);
                    people.add(stu);
                } // end of if
           } // end of not Q
           flag = input;
       } // end of while loop       
       
       // now to call the print display stuffs
       for (int i = 0; i < people.size(); i++)
       {
           people.get(i).display();
       }
       
       
    } // end of main
    
} // end of class
