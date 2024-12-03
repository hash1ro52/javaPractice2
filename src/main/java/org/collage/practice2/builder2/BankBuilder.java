package org.collage.practice2.builder2;

public class BankBuilder {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public Bank build() {
        return new Bank(name);
    }
}
