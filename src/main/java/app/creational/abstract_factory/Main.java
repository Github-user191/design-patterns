package app.creational.abstract_factory;


// ABSTRACT FACTORY PATTERN
// - Used to provide an interface/abstract class for creating families of related (or dependant) objects without specifying concrete classes
// - Lets a class return a Factory of classes, one level higher than Factory Method Pattern
// - Isolates the client code from concrete (Implementation) classes
// - Eases the exchanging of object families

// USES OF ABSTRACT FACTORY PATTERN
// - When the system needs to be independent of how its objects are created and composed
// - When you want to provide a library of objects that does not show implementations and only reveals interfaces

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[])throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the name of Bank from where you want to take loan amount: ");
        String bankName=br.readLine();

        System.out.print("\n");
        System.out.print("Enter the type of loan e.g. home loan or business loan or education loan : ");

        String loanName=br.readLine();
        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank b=bankFactory.getBank(bankName);

        System.out.print("\n");
        System.out.print("Enter the interest rate for "+b.getBankName()+ ": ");

        double rate=Double.parseDouble(br.readLine());
        System.out.print("\n");
        System.out.print("Enter the loan amount you want to take: ");

        double loanAmount=Double.parseDouble(br.readLine());
        System.out.print("\n");
        System.out.print("Enter the number of years to pay your entire loan amount: ");
        int years=Integer.parseInt(br.readLine());

        System.out.print("\n");
        System.out.println("you are taking the loan from "+ b.getBankName());

        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan l=loanFactory.getLoan(loanName);
        l.getInterestRate(rate);
        l.calculateLoanPayment(loanAmount,years);
    }
}
