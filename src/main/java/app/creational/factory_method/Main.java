package app.creational.factory_method;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// FACTORY METHOD PATTERN - Choosing classes at runtime
// - Using a METHOD to return one of several possible classes that share a common super class
// - Define an interface or abstract class for creating an object but allow the subclasses to decide which class to instantiate
// - Subclasses are responsible to create the instance of the class
// - Promotes loose-coupling by eliminating the need to bind app-specific classes in the code

// WHEN TO USE FACTORY METHOD PATTERN
// - When a class doesn't know what sub-classes will be required to create
// - When the parent classes choose the creation of objects to its sub-classes
public class Main {
    public static void main(String[] args) throws IOException {

        System.out.print("Enter the name of plan for which the bill will be generated: ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String planName=br.readLine();
        System.out.print("Enter the number of units for bill will be calculated: ");
        int units=Integer.parseInt(br.readLine());

        Plan p = GetPlanFactory.getPlan(planName);
        //call getRate() method and calculateBill()method of the Plan entered.

        System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");
        p.getRate();
        p.calculateBill(units);

    }
}
