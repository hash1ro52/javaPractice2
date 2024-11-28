package org.collage.practice2.builder;

public class UkrainePictureBuilder extends PictureBuilder {
    @Override
    public PictureBuilder setBasicParams(String name, short year, String author) {
        super.setBasicParams(name, year, author);
        setCategoryParams("Default Ukraine Theme", "Ukrainian Art");
        return this;
    }
}

