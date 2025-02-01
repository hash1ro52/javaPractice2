package org.collage.practice8.visitor2;

public interface BankVisitor {
    String visit(User user);
    String visit(Account account);
}
