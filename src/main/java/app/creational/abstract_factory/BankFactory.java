package app.creational.abstract_factory;

public class BankFactory extends AbstractFactory{
    public Bank getBank(String bank){
        if(bank == null){
            return null;
        }
        if(bank.equalsIgnoreCase("WellsFargo")){
            return new WellsFargo();
        } else if(bank.equalsIgnoreCase("Citigroup")){
            return new Citigroup();
        } else if(bank.equalsIgnoreCase("JPMorgan")){
            return new JPMorgan();
        }
        return null;
    }
    public Loan getLoan(String loan) {
        return null;
    }
}
