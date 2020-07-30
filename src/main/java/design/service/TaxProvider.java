package design.service;

public interface TaxProvider {

    int getDefaultTaxAmount();

    int getTaxAmountForProvidedActivity(String type);
}
