package org.rumter.examples.library.service.ao.impl;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.rumter.examples.library.service.ao.Author;
import org.rumter.examples.library.service.ao.Book;
import org.rumter.examples.library.service.ao.LibraryAO;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class FakeLibraryAO implements LibraryAO {
    
    /**
     * authorId => Author
     */
    private final Map<Integer, Author> authors;
    
    /**
     * bookId => Book
     */
    private final Map<Integer, Book> books;
    
    public FakeLibraryAO() {
        this.authors = Map.of(
                1, new Author(1, "Isaac Asimov"),
                2, new Author(2, "Stephen King"));
        
        this.books = Map.of(
                1, new Book(1, 1, "Foundation"),
                2, new Book(2, 1, "The End of Eternity"),
                3, new Book(3, 1, "I, Robot"),
                4, new Book(4, 2, "The Green Mile"),
                5, new Book(5, 2, "11.22.63"));
    }
    
    @Override
    public Set<Author> getAuthors() {
        return new HashSet<>(authors.values());
    }
    
    @Override
    public Author getAuthor(int authorId) {
        return authors.get(authorId);
    }
    
    @Override
    public Set<Book> getBooks(int authorId) {
        return books.values().stream()
                .filter(book -> book.authorId() == authorId)
                .collect(Collectors.toSet());
    }
    
}
