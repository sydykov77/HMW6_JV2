package com.company;

class Book<T> implements Writable<T>{

    private T page;
    private T chapter;

    Book(T page, T chapter){
        this.page = page;
        this.chapter = chapter;
    }

    public T getPage() { return page; }
    public T getChapter() { return chapter; }
}