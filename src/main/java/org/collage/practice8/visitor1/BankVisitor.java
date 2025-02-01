package org.collage.practice8.visitor1;

public interface BankVisitor {
    String visit(User user);
    String visit(BankAccount account);
}
