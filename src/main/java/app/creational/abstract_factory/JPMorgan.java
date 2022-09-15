package app.creational.abstract_factory;

public class JPMorgan implements Bank{
    private final String BANK_NAME;

    public JPMorgan() {
        BANK_NAME = "JPMorgan";
    }

    @Override
    public String getBankName() {
        return BANK_NAME;
    }
}
