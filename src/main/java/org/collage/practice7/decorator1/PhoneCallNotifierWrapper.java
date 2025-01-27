package org.collage.practice7.decorator1;

class PhoneCallNotifierWrapper extends SystemAlert {
    private String phoneNumber;

    public PhoneCallNotifierWrapper(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notifyUser() {
        System.out.println("Making a phone call to: " + phoneNumber);
    }
}
