package com.rishabh.session2OOP.library;

public class Library {
    private Book[] books = {
            new Book("Book 1", "Author 1", 4),
            new Book("Book 2", "Author 2", 1),
            new Book("Book 3", "Author 3", 1),
            new Book("Book 4", "Author 4", 4),
            new Book("Book 5", "Author 5", 2),
    };


    public void returnBook(Book borrowedBook){
        for(Book book: books){
            if(borrowedBook == book){
                book.incrementCount();
                System.out.println("Book returned successfully");
                return;
            }
        }
        System.out.println("Book not found, you are trying to return book that doesn't belong to this library");
    }


    public void borrowBook(Book requestedBook){
        for(Book book: books){
            if(requestedBook == book){
                if(book.getAvailableCopies()>0){
                    System.out.println("Book borrowed successfully");
                    book.decrementCount();
                }else{
                    System.out.println("Book not available right now");
                }
                return;
            }
        }
        System.out.println("Book not found, you are trying to request book that doesn't belong to this library");
    }

    public void printLibrary(){
        System.out.println("\n==================Library==================\n");
        for(Book book: books){
            System.out.format("Title: %s, Author: %s, Stock: %d\n", book.getTitle(), book.getAuthor(), book.getAvailableCopies());
        }
    }


    public static void main(String[] args) {
        Library library = new Library();
        library.printLibrary();
        library.borrowBook(library.books[1]);
        library.printLibrary();
        library.borrowBook(library.books[2]);
        library.printLibrary();
        library.borrowBook(library.books[2]); // should show out of stock
        library.printLibrary();
        library.returnBook(library.books[1]);
        library.printLibrary();
        library.returnBook(new Book("NA","NA", 0));
    }


}
