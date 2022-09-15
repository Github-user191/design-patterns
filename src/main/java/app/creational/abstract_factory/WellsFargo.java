package app.creational.abstract_factory;

public class WellsFargo implements Bank{
    private final String BANK_NAME;

    public WellsFargo() {
        BANK_NAME = "WellsFargo";
    }

    @Override
    public String getBankName() {
        return BANK_NAME;
    }
}
