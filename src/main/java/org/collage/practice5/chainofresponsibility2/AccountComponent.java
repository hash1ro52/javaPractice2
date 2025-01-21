package org.collage.practice5.chainofresponsibility2;

import java.util.ArrayList;
import java.util.List;

public abstract class AccountComponent {
    protected String name;
    protected List<AccountComponent> subAccounts = new ArrayList<>();

    public abstract void processTransaction();

    public void addAccount(AccountComponent component) {
        subAccounts.add(component);
    }

    public void removeAccount(String name) {
        subAccounts.removeIf(account -> account.name.equals(name));
    }
}
