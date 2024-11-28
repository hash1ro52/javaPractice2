package org.collage.practice2.builder;

public class Picture {
    private final String name;
    private final short year;
    private final String author;
    private final String theme;
    private final String category;
    private final String[] colors;
    private final Size size;
    private final boolean isWithFrames;
    private final String canvas;

    public Picture(String name, short year, String author, String theme, String category,
                   String[] colors, Size size, boolean isWithFrames, String canvas) {
        this.name = name;
        this.year = year;
        this.author = author;
        this.theme = theme;
        this.category = category;
        this.colors = colors;
        this.size = size;
        this.isWithFrames = isWithFrames;
        this.canvas = canvas;
    }

    public String getName() {
        return name;
    }

    public short getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Picture{name='" + name + "', year=" + year +
                ", author='" + author + "', theme='" + theme +
                "', category='" + category + "', colors=" + String.join(", ", colors) +
                ", size=" + size + ", isWithFrames=" + isWithFrames + ", canvas='" + canvas + "'}";
    }
}

