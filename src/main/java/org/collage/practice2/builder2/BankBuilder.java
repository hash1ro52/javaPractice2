package org.collage.practice2.builder2;

public class BankBuilder {
    private String name;

    public BankBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public Bank build() {
        return new Bank(name);
    }
}
