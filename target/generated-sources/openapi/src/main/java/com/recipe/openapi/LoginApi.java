/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.recipe.openapi;

import com.recipe.openapi.LoginRequest;
import com.recipe.openapi.LoginResponse;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T22:56:01.260710800-03:00[America/Sao_Paulo]")
@Validated
@Api(value = "login", description = "the login API")
public interface LoginApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /login : Performs the login returning an access and a refresh token.
     *
     * @param loginRequest The LoginRequest object. (required)
     * @return The LoginResponse object. (status code 200)
     *         or Bad request. Check the message for more details. (status code 400)
     *         or Not found. Check the message for more details. (status code 404)
     */
    @ApiOperation(value = "Performs the login returning an access and a refresh token.", nickname = "login", notes = "", response = LoginResponse.class, tags={ "Login", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The LoginResponse object.", response = LoginResponse.class),
        @ApiResponse(code = 400, message = "Bad request. Check the message for more details."),
        @ApiResponse(code = 404, message = "Not found. Check the message for more details.") })
    @PostMapping(
        value = "/login",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<LoginResponse> login(@ApiParam(value = "The LoginRequest object." ,required=true )  @Valid @RequestBody LoginRequest loginRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"accessToken\" : \"accessToken\", \"refreshToken\" : \"refreshToken\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}