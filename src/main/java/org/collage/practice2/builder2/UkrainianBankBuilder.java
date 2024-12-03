package org.collage.practice2.builder2;

public class UkrainianBankBuilder extends BankBuilder {
    @Override
    public void setName(String name) {
        super.setName(name + " - Ukrainian Digital Bank");
    }
}
