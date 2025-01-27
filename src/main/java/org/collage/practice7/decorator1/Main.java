package org.collage.practice7.decorator1;

public class Main {
    public static void main(String[] args) {
        SystemAlert emailNotifier = new EmailNotifierWrapper("user@example.com");
        SystemAlert phoneNotifier = new PhoneCallNotifierWrapper("123-456-7890");
        SystemAlert inAppNotifier = new InAppNotifierWrapper("user123");

        emailNotifier.notifyUser();
        phoneNotifier.notifyUser();
        inAppNotifier.notifyUser();
    }
}
