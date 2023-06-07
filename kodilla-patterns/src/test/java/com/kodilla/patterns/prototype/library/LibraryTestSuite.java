package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LibraryTestSuite {

    @Test
    void testGetBooks() {
        // Given
        Library library = new Library("Library 1");
        IntStream.rangeClosed(1, 5)
                .forEach(n -> library.getBooks().add(new Book("Title " + n, "Author " + n, LocalDate.now())));

        // When
        Library shallowCopyLibrary = null;
        try {
            shallowCopyLibrary = library.clone();
            shallowCopyLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Library deepCopyLibrary = null;
        try {
            deepCopyLibrary = library.clone();
            deepCopyLibrary.setName("Library 3");
            deepCopyLibrary.getBooks().add(new Book("New Book", "New Author", LocalDate.now()));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // Then
        System.out.println(library.getName() + " contains " + library.getBooks().size() + " books.");
        System.out.println(shallowCopyLibrary.getName() + " contains " + shallowCopyLibrary.getBooks().size() + " books.");
        System.out.println(deepCopyLibrary.getName() + " contains " + deepCopyLibrary.getBooks().size() + " books.");

        assertEquals(5, library.getBooks().size());
        assertEquals(5, shallowCopyLibrary.getBooks().size());
        assertEquals(6, deepCopyLibrary.getBooks().size());
    }
}
