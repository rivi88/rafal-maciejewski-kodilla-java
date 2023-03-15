package com.kodilla.stream.immutable;

public final class Book {

    private final String title;
    private final String author;
    private final int yourOfPublication;

    public Book(final String title, final String author, final int yourOfPublication) {
        this.title = title;
        this.author = author;
        this.yourOfPublication = yourOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYourOfPublication() {
        return yourOfPublication;
    }


}
