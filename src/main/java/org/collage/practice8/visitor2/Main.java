package org.collage.practice8.visitor2;

public class Main {
    public static void main(String[] args) {
        User user = new User("Alice", "Johnson", "alice@mail.com");
        Account account = new Account(user, 5000);

        BankVisitor jsonVisitor = new JsonVisitor();

        System.out.println(user.accept(jsonVisitor));
        System.out.println(account.accept(jsonVisitor));
    }
}
