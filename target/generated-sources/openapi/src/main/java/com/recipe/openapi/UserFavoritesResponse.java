package com.recipe.openapi;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.recipe.openapi.RecipeResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * All favorites for the current user
 */
@ApiModel(description = "All favorites for the current user")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T17:27:29.458741200-03:00[America/Sao_Paulo]")
public class UserFavoritesResponse   {
  @JsonProperty("favoriteId")
  private String favoriteId;

  @JsonProperty("recipe")
  private RecipeResponse recipe;

  public UserFavoritesResponse favoriteId(String favoriteId) {
    this.favoriteId = favoriteId;
    return this;
  }

  /**
   * The recipe id
   * @return favoriteId
  */
  @ApiModelProperty(example = "abc", value = "The recipe id")


  public String getFavoriteId() {
    return favoriteId;
  }

  public void setFavoriteId(String favoriteId) {
    this.favoriteId = favoriteId;
  }

  public UserFavoritesResponse recipe(RecipeResponse recipe) {
    this.recipe = recipe;
    return this;
  }

  /**
   * Get recipe
   * @return recipe
  */
  @ApiModelProperty(value = "")

  @Valid

  public RecipeResponse getRecipe() {
    return recipe;
  }

  public void setRecipe(RecipeResponse recipe) {
    this.recipe = recipe;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserFavoritesResponse userFavoritesResponse = (UserFavoritesResponse) o;
    return Objects.equals(this.favoriteId, userFavoritesResponse.favoriteId) &&
        Objects.equals(this.recipe, userFavoritesResponse.recipe);
  }

  @Override
  public int hashCode() {
    return Objects.hash(favoriteId, recipe);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserFavoritesResponse {\n");
    
    sb.append("    favoriteId: ").append(toIndentedString(favoriteId)).append("\n");
    sb.append("    recipe: ").append(toIndentedString(recipe)).append("\n");
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

