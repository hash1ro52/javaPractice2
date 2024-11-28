package org.collage.practice2.builder;

public class PictureBuilder {
    private String name;
    private short year;
    private String author;
    private String theme;
    private String category;
    private String[] colors;
    private Size size;
    private boolean isWithFrames;
    private String canvas;

    public PictureBuilder setBasicParams(String name, short year, String author) {
        this.name = name;
        this.year = year;
        this.author = author;
        return this;
    }

    public PictureBuilder setSizeParams(Size size) {
        this.size = size;
        return this;
    }

    public PictureBuilder setColorParams(String[] colors, boolean isWithFrames, String canvas) {
        this.colors = colors;
        this.isWithFrames = isWithFrames;
        this.canvas = canvas;
        return this;
    }

    public PictureBuilder setCategoryParams(String theme, String category) {
        this.theme = theme;
        this.category = category;
        return this;
    }

    public Picture build() {
        if (name == null || author == null || size == null || colors == null) {
            throw new IllegalStateException("Not all required parameters are set!");
        }
        return new Picture(name, year, author, theme, category, colors, size, isWithFrames, canvas);
    }
}
