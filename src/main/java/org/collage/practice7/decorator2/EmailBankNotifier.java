package org.collage.practice7.decorator2;

class EmailBankNotifier extends BankAlert {
    private String emailAddress;

    public EmailBankNotifier(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void notifyCustomer() {
        System.out.println("Sending a banking alert to email: " + emailAddress);
    }
}
