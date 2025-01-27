package org.collage.practice7.decorator1;
class EmailNotifierWrapper extends SystemAlert {
    private String emailAddress;

    public EmailNotifierWrapper(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void notifyUser() {
        System.out.println("Sending an email to: " + emailAddress);
    }
}
