package org.collage.practice5.chainofresponsibility;

public class Button extends WindowComponent {
    private String text;
    private String imagePath;

    public Button(String name, String text, String imagePath) {
        this.name = name;
        this.text = text;
        this.imagePath = imagePath;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Button: " + text + " with image: " + imagePath);
    }

    @Override
    public void addComponent(WindowComponent component) {
        throw new UnsupportedOperationException("Buttons cannot have nested components.");
    }

    @Override
    public void removeComponent(String name) {
        throw new UnsupportedOperationException("Buttons cannot have nested components.");
    }
}
