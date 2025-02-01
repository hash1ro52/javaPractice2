package org.collage.practice8.visitor1;

public class Main {
    public static void main(String[] args) {
        User user = new User("Alice", "Smith");
        BankAccount account = new BankAccount(user, 1000);

        JsonVisitor jsonVisitor = new JsonVisitor();

        System.out.println(user.accept(jsonVisitor));
        System.out.println(account.accept(jsonVisitor));
    }
}
