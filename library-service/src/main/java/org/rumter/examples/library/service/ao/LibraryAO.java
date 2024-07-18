package org.rumter.examples.library.service.ao;

import java.util.Set;

public interface LibraryAO {
    
    Set<Author> getAuthors();
    
    Author getAuthor(int authorId);
    
    Set<Book> getBooks(int authorId);
    
}
