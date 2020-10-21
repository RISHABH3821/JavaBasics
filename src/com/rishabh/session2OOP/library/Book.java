package com.rishabh.session2OOP.library;

public class Book {
    private String title, author;
    private int availableCopies;

    public Book(String title, String author, int availableCopies) {
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
    }


    public void incrementCount(){
        availableCopies++;
    }

    public void decrementCount(){
        availableCopies--;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }
}
