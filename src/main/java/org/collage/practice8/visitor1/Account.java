package org.collage.practice8.visitor1;

public abstract class Account {
    public abstract String accept(BankVisitor visitor);
}
