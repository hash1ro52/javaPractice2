package org.collage.practice2.builder;

public class UsaPictureBuilder extends PictureBuilder {
    @Override
    public PictureBuilder setBasicParams(String name, short year, String author) {
        super.setBasicParams(name, year, author);
        setCategoryParams("Default USA Theme", "American Art");
        return this;
    }
}

