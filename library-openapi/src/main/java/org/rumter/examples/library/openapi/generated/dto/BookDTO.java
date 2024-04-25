package org.rumter.examples.library.openapi.generated.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.constraints.NotNull;


import java.util.*;
import javax.annotation.Generated;

/**
 * BookDTO
 */

@JsonTypeName("Book")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class BookDTO implements Serializable {

  private static final long serialVersionUID = 1L;

  private Integer bookId;

  private Integer authorId;

  private String title;

  public BookDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BookDTO(Integer bookId, Integer authorId, String title) {
    this.bookId = bookId;
    this.authorId = authorId;
    this.title = title;
  }

  public BookDTO bookId(Integer bookId) {
    this.bookId = bookId;
    return this;
  }

  /**
   * Get bookId
   * @return bookId
  */
  @NotNull
  @JsonProperty("bookId")
  public Integer getBookId() {
    return bookId;
  }

  public void setBookId(Integer bookId) {
    this.bookId = bookId;
  }

  public BookDTO authorId(Integer authorId) {
    this.authorId = authorId;
    return this;
  }

  /**
   * Get authorId
   * @return authorId
  */
  @NotNull
  @JsonProperty("authorId")
  public Integer getAuthorId() {
    return authorId;
  }

  public void setAuthorId(Integer authorId) {
    this.authorId = authorId;
  }

  public BookDTO title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @NotNull
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookDTO book = (BookDTO) o;
    return Objects.equals(this.bookId, book.bookId) &&
        Objects.equals(this.authorId, book.authorId) &&
        Objects.equals(this.title, book.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookId, authorId, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookDTO {\n");
    sb.append("    bookId: ").append(toIndentedString(bookId)).append("\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

