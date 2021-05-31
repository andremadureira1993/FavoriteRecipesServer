/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.recipe.openapi;

import com.recipe.openapi.FavoritesResponse;
import com.recipe.openapi.UserFavoritesResponse;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T17:27:29.458741200-03:00[America/Sao_Paulo]")
@Validated
@Api(value = "favorites", description = "the favorites API")
public interface FavoritesApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /favorites/all : Get all Recipes and the total number of person that has set as favorite
     *
     * @return Successfully retrieved recipes (status code 200)
     */
    @ApiOperation(value = "Get all Recipes and the total number of person that has set as favorite", nickname = "favoritesAllGet", notes = "", response = FavoritesResponse.class, responseContainer = "List", tags={ "Favorite", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully retrieved recipes", response = FavoritesResponse.class, responseContainer = "List") })
    @GetMapping(
        value = "/favorites/all",
        produces = { "application/json" }
    )
    default ResponseEntity<List<FavoritesResponse>> favoritesAllGet() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"totalPersonSuitable\" : 12, \"dish\" : \"Traditional Coffee\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /favorites/{dishId} : Remove a relation of recipe for the logged user
     *
     * @param dishId  (required)
     * @return OK (status code 200)
     */
    @ApiOperation(value = "Remove a relation of recipe for the logged user", nickname = "favoritesDishIdDelete", notes = "", tags={ "Favorite", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK") })
    @DeleteMapping(
        value = "/favorites/{dishId}"
    )
    default ResponseEntity<Void> favoritesDishIdDelete(@ApiParam(value = "",required=true) @PathVariable("dishId") String dishId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /favorites/{dishId} : Add a dish to favorites for a user
     *
     * @param dishId  (required)
     * @return OK (status code 200)
     */
    @ApiOperation(value = "Add a dish to favorites for a user", nickname = "favoritesDishIdPost", notes = "", tags={ "Favorite", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK") })
    @PostMapping(
        value = "/favorites/{dishId}"
    )
    default ResponseEntity<Void> favoritesDishIdPost(@ApiParam(value = "",required=true) @PathVariable("dishId") String dishId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /favorites : Get all favorites for each person
     *
     * @return Successfully retrieved favorites (status code 200)
     */
    @ApiOperation(value = "Get all favorites for each person", nickname = "favoritesGet", notes = "", response = UserFavoritesResponse.class, responseContainer = "List", tags={ "Favorite", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully retrieved favorites", response = UserFavoritesResponse.class, responseContainer = "List") })
    @GetMapping(
        value = "/favorites",
        produces = { "application/json" }
    )
    default ResponseEntity<List<UserFavoritesResponse>> favoritesGet() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"favoriteId\" : \"abc\", \"recipe\" : { \"totalPersonSuitable\" : 12, \"dish\" : \"Traditional Coffee\", \"dateAndTimeOfCreation\" : \"29-05-2021 10:00\", \"isVegetarian\" : false, \"ingredients\" : [ \"ingredients\", \"ingredients\" ], \"cookingInstructions\" : \"cookingInstructions\", \"id\" : \"id\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}