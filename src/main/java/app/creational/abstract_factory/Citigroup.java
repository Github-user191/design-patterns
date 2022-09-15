package app.creational.abstract_factory;

public class Citigroup implements Bank{
    private final String BANK_NAME;

    public Citigroup() {
        BANK_NAME = "Citigroup";
    }

    @Override
    public String getBankName() {
        return BANK_NAME;
    }
}
