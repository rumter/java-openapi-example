/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.rumter.examples.library.openapi.generated;

import org.rumter.examples.library.openapi.generated.dto.AuthorDTO;
import org.rumter.examples.library.openapi.generated.dto.BookDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public interface LibraryOpenAPIController {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /library/authors : Get authors list.
     *
     * @return OK (status code 200)
     */
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/library/authors",
        produces = { "application/json" }
    )
    
    default ResponseEntity<List<AuthorDTO>> getAuthors(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"name\" : \"name\", \"authorId\" : 0 }, { \"name\" : \"name\", \"authorId\" : 0 } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /library/books/ : Get books list for given author.
     *
     * @param authorId  (optional)
     * @return OK (status code 200)
     */
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/library/books/",
        produces = { "application/json" }
    )
    
    default ResponseEntity<List<BookDTO>> getBooksByAuthorId(
         @RequestParam(value = "authorId", required = false) Integer authorId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"authorId\" : 6, \"title\" : \"title\", \"bookId\" : 0 }, { \"authorId\" : 6, \"title\" : \"title\", \"bookId\" : 0 } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
