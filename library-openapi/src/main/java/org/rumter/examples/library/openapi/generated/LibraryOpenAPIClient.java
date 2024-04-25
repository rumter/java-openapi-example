package org.rumter.examples.library.openapi.generated;

import org.rumter.examples.library.openapi.generated.invoker.ApiClient;

import org.rumter.examples.library.openapi.generated.dto.AuthorDTO;
import org.rumter.examples.library.openapi.generated.dto.BookDTO;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class LibraryOpenAPIClient {
    private ApiClient apiClient;

    public LibraryOpenAPIClient() {
        this(new ApiClient());
    }

    public LibraryOpenAPIClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get authors list.
     * 
     * <p><b>200</b> - OK
     * @return List&lt;AuthorDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AuthorDTO> getAuthors() throws RestClientException {
        return getAuthorsWithHttpInfo().getBody();
    }

    /**
     * Get authors list.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;List&lt;AuthorDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AuthorDTO>> getAuthorsWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<AuthorDTO>> localReturnType = new ParameterizedTypeReference<List<AuthorDTO>>() {};
        return apiClient.invokeAPI("/library/authors", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get books list for given author.
     * 
     * <p><b>200</b> - OK
     * @param authorId  (optional)
     * @return List&lt;BookDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<BookDTO> getBooksByAuthorId(Integer authorId) throws RestClientException {
        return getBooksByAuthorIdWithHttpInfo(authorId).getBody();
    }

    /**
     * Get books list for given author.
     * 
     * <p><b>200</b> - OK
     * @param authorId  (optional)
     * @return ResponseEntity&lt;List&lt;BookDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<BookDTO>> getBooksByAuthorIdWithHttpInfo(Integer authorId) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "authorId", authorId));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<BookDTO>> localReturnType = new ParameterizedTypeReference<List<BookDTO>>() {};
        return apiClient.invokeAPI("/library/books/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
