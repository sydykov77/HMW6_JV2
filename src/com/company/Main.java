package com.company;

public class Main {

    public static void main(String[] args) {

        Book<Number> book1 = new Book<Number>(1235, 50);
        Book<Number> book2 = new Book<>(2373, 67);
        System.out.println(book1.getPage()+" страниц и "+book1.getChapter()+" глав." );
        System.out.println(book2.getPage()+" страниц и "+book2.getChapter()+" глав." );
    }
}
