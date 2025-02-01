package org.collage.practice8.visitor2;

public class JsonVisitor implements BankVisitor {
    @Override
    public String visit(User user) {
        return "{ \"User\": \"" + user.getFullName() + "\", \"Email\": \"" + user.getEmail() + "\" }";
    }

    @Override
    public String visit(Account account) {
        return "{ \"Account\": \"Owner: " + account.getOwner().getFullName() + "\", \"Balance\": " + account.getBalance() + " }";
    }
}
