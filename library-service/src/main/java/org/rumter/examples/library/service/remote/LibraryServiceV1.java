package org.rumter.examples.library.service.remote;

import java.util.List;

import org.rumter.examples.library.openapi.generated.v1.AuthorsOpenAPIController;
import org.rumter.examples.library.openapi.generated.v1.BooksOpenAPIController;
import org.rumter.examples.library.openapi.generated.v1.dto.AuthorDTO;
import org.rumter.examples.library.openapi.generated.v1.dto.BookDTO;
import org.rumter.examples.library.service.ao.LibraryAO;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.util.Objects.requireNonNull;

@Lazy
@RestController
@RequestMapping(value = "/api/library/v1/", produces = { MediaType.APPLICATION_JSON_VALUE })
public class LibraryServiceV1 implements AuthorsOpenAPIController, BooksOpenAPIController {
    
    private final LibraryAO libraryAO;
    
    public LibraryServiceV1(LibraryAO libraryAO) {
        this.libraryAO = requireNonNull(libraryAO, "libraryAO is null");
    }
    
    @Override
    public ResponseEntity<List<AuthorDTO>> getAuthors() {
        return ResponseEntity.ok(libraryAO.getAuthors().stream()
                .map(it -> new AuthorDTO(it.authorId(), it.name()))
                .toList());
    }
    
    @Override
    public ResponseEntity<List<BookDTO>> getBooksByAuthorId(Integer authorId) {
        return ResponseEntity.ok(libraryAO.getBooks(authorId).stream()
                .map(it -> new BookDTO(it.bookId(), it.authorId(), it.title()))
                .toList());
    }
    
}
