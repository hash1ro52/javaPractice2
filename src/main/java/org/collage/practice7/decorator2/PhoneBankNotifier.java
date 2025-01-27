package org.collage.practice7.decorator2;

class PhoneBankNotifier extends BankAlert {
    private String phoneNumber;

    public PhoneBankNotifier(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notifyCustomer() {
        System.out.println("Sending a banking SMS to phone number: " + phoneNumber);
    }
}
