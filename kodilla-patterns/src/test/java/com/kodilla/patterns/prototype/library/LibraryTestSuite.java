package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LibraryTestSuite {

    @Test
    void testGetBooks() throws CloneNotSupportedException {
        // Given
        Library library = new Library("Library 1");
        IntStream.rangeClosed(1, 5)
                .forEach(n -> library.getBooks().add(new Book("Title " + n, "Author " + n, LocalDate.now())));

        // When
        Library shallowCopyLibrary = library.clone();
        shallowCopyLibrary.setName("Library 2");

        Library deepCopyLibrary = library.deepCopy();
        deepCopyLibrary.setName("Library 3");
        deepCopyLibrary.getBooks().add(new Book("New Book", "New Author", LocalDate.now()));

        // Then
        System.out.println(library.getName() + " contains " + library.getBooks().size() + " books.");
        System.out.println(shallowCopyLibrary.getName() + " contains " + shallowCopyLibrary.getBooks().size() + " books.");
        System.out.println(deepCopyLibrary.getName() + " contains " + deepCopyLibrary.getBooks().size() + " books.");

        assertEquals(5, library.getBooks().size());
        assertEquals(5, shallowCopyLibrary.getBooks().size());
        assertEquals(6, deepCopyLibrary.getBooks().size());
    }
}
