package org.collage.practice9.proxy2;

public class Main {
    public static void main(String[] args) {
        BankAccess bank = new BankProxy("SecureBank");
        BankController controller = new BankController(bank);

        controller.makeTransaction();
        controller.confirmTransaction();
    }
}
