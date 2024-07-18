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
/api/library/v1/authors
/api/library/v1/authors/{authorId}
/api/library/v1/books/{authorId}
```

OpenAPI REST client: CLI application.