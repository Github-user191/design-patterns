package app.creational.abstract_factory;

public abstract class AbstractFactory {
    public abstract Loan getLoan(String loan);
    public abstract Bank getBank(String bank);
}
