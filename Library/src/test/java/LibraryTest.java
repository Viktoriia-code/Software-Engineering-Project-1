import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    private Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
        library.addBook("test");
    }

    @Test
    void addBook() {
        // Arrange
        int booksCount = library.listBooks().size();

        // Act
        library.addBook("War and peace");

        // Assert
        assertEquals(library.listBooks().size(), booksCount + 1);
    }

    @Test
    void removeBook() {
        // Arrange
        int booksCount = library.listBooks().size();

        // Act
        library.removeBook("test");

        // Assert
        assertEquals(library.listBooks().size(), booksCount - 1);
    }

    @Test
    void listBooks() {
        // Assert
        assertEquals(library.listBooks().size(), 1);
    }
}