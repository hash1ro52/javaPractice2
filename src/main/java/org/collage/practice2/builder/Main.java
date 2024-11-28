package org.collage.practice2.builder;

public class Main {
    public static void main(String[] args) {
        Size size = new Size();
        size.setHeight((short) 150);
        size.setWidth((short) 100);

        PictureBuilder builder = new UsaPictureBuilder();
        Picture usaPicture = builder
                .setBasicParams("Statue of Liberty", (short) 2023, "John Doe")
                .setSizeParams(size)
                .setColorParams(new String[]{"Red", "Blue", "White"}, true, "Canvas A")
                .build();

        System.out.println("Created USA Picture: " + usaPicture);

        PictureBuilder ukraineBuilder = new UkrainePictureBuilder();
        Picture ukrainePicture = ukraineBuilder
                .setBasicParams("Ukrainian Landscape", (short) 2024, "Ivan Franko")
                .setSizeParams(size)
                .setColorParams(new String[]{"Yellow", "Blue"}, false, "Canvas B")
                .build();

        System.out.println("Created Ukraine Picture: " + ukrainePicture);
    }
}
