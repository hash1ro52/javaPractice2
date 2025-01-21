package org.collage.practice5.chainofresponsibility;

public class Window extends WindowComponent {
    private String title;
    private int width;
    private int height;

    public Window(String name, String title, int width, int height) {
        this.name = name;
        this.title = title;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        // Set graphics buffer
        // Set window position
        // Reset counters
        System.out.println("Drawing Window: " + title + " (" + width + "x" + height + ")");
        superDraw();
    }

    private void superDraw() {
        for (WindowComponent component : nestedComponents) {
            component.draw();
        }
    }
}
