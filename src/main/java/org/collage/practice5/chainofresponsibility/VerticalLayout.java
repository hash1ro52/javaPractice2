package org.collage.practice5.chainofresponsibility;

public class VerticalLayout extends WindowComponent {
    private int width;
    private int height;

    public VerticalLayout(String name, int width, int height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing VerticalLayout: " + name + " (" + width + "x" + height + ")");
        for (WindowComponent component : nestedComponents) {
            component.draw();
        }
    }
}
