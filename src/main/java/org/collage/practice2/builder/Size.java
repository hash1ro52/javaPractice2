package org.collage.practice2.builder;

public class Size {
    private short height;
    private short width;

    public void setHeight(short height) {
        this.height = height;
    }

    public void setWidth(short width) {
        this.width = width;
    }

    public short getHeight() {
        return height;
    }

    public short getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Size{height=" + height + ", width=" + width + "}";
    }
}
