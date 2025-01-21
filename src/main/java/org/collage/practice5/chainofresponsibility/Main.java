package org.collage.practice5.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        Window mainWindow = new Window("mainWindow", "Main Application", 800, 600);
        VerticalLayout layout = new VerticalLayout("mainLayout", 800, 600);
        Button button1 = new Button("button1", "OK", "ok.png");
        Button button2 = new Button("button2", "Cancel", "cancel.png");

        layout.addComponent(button1);
        layout.addComponent(button2);
        mainWindow.addComponent(layout);

        WindowManager manager = new WindowManager(mainWindow);
        manager.draw();
    }
}
