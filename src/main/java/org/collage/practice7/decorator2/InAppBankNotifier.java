package org.collage.practice7.decorator2;

class InAppBankNotifier extends BankAlert {
    private String accountUsername;

    public InAppBankNotifier(String accountUsername) {
        this.accountUsername = accountUsername;
    }

    @Override
    public void notifyCustomer() {
        System.out.println("Sending an in-app banking notification to account: " + accountUsername);
    }
}
