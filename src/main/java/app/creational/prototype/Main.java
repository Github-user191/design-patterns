package app.creational.prototype;

// PROTOTYPE DESIGN PATTERN
// - Instead of creating an object from scratch everytime, you can make copies of an original instance and change as required
// - Should be used if the cost of creating a new object is expensive and resource intensive.
// - Allows you to add or remove objects at runtime
// - Reduces the need of subclassing
// - Only worried with the end result and not the class itself

// WHEN TO USE PROTOTYPE PATTERN
// - When the cost of creating an object is expensive or complicated.
// - When you want to keep the number of classes in an application minimum.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Employee Id: ");
        int eid=Integer.parseInt(br.readLine());
        System.out.print("\n");

        System.out.print("Enter Employee Name: ");
        String ename=br.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee Designation: ");
        String edesignation=br.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee Address: ");
        String eaddress=br.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee Salary: ");
        double esalary= Double.parseDouble(br.readLine());
        System.out.print("\n");

        // Original object created
        EmployeeRecord e1=new EmployeeRecord(eid,ename,edesignation,esalary,eaddress);
        // Calling method on object
        e1.showRecord();

        System.out.println("\n");

        // Creating clone/prototype of the original object and returning a copy of the object
        EmployeeRecord e2= (EmployeeRecord) e1.getClone();
        // Calling method on cloned object
        e2.showRecord();
    }
}
