package org.collage.practice5.chainofresponsibility;

public class WindowManager {
    private Window window;

    public WindowManager(Window window) {
        this.window = window;
    }

    public void draw() {
        if (window != null) {
            window.draw();
        }
    }
}
