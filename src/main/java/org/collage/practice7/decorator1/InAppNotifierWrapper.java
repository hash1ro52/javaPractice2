package org.collage.practice7.decorator1;

class InAppNotifierWrapper extends SystemAlert {
    private String username;

    public InAppNotifierWrapper(String username) {
        this.username = username;
    }

    @Override
    public void notifyUser() {
        System.out.println("Sending in-app notification to user: " + username);
    }
}
