package org.collage.practice5.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

public abstract class WindowComponent {
    protected String name;
    protected List<WindowComponent> nestedComponents = new ArrayList<>();

    public abstract void draw();

    public void addComponent(WindowComponent component) {
        nestedComponents.add(component);
    }

    public void removeComponent(String name) {
        nestedComponents.removeIf(component -> component.name.equals(name));
    }
}
