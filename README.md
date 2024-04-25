# java-openapi-example

Subject domain:
```java
interface Author {
    int getAuthorId();
    String getName();
}

interface Book {
    int getBookId();
    int getAuthorId();
    String getTitle();
}

interface Library {
    Set<Author> getAuthors();
    Set<Book> getBooksByAuthorId(int authorId);
}
```

OpenAPI REST server:
```
/library/authors/
/library/authors/{authorId}
/library/books/{authorId}
```

OpenAPI REST client: CLI application.