package com.recipe.openapi;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The total of favorite and number of person the dish is suitable.
 */
@ApiModel(description = "The total of favorite and number of person the dish is suitable.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T22:56:01.260710800-03:00[America/Sao_Paulo]")
public class FavoritesResponse   {
  @JsonProperty("dish")
  private String dish;

  @JsonProperty("totalPersonSuitable")
  private Integer totalPersonSuitable;

  public FavoritesResponse dish(String dish) {
    this.dish = dish;
    return this;
  }

  /**
   * The recipe name
   * @return dish
  */
  @ApiModelProperty(example = "Traditional Coffee", value = "The recipe name")


  public String getDish() {
    return dish;
  }

  public void setDish(String dish) {
    this.dish = dish;
  }

  public FavoritesResponse totalPersonSuitable(Integer totalPersonSuitable) {
    this.totalPersonSuitable = totalPersonSuitable;
    return this;
  }

  /**
   * The number total of person that the dish was suitable.
   * @return totalPersonSuitable
  */
  @ApiModelProperty(example = "12", value = "The number total of person that the dish was suitable.")


  public Integer getTotalPersonSuitable() {
    return totalPersonSuitable;
  }

  public void setTotalPersonSuitable(Integer totalPersonSuitable) {
    this.totalPersonSuitable = totalPersonSuitable;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FavoritesResponse favoritesResponse = (FavoritesResponse) o;
    return Objects.equals(this.dish, favoritesResponse.dish) &&
        Objects.equals(this.totalPersonSuitable, favoritesResponse.totalPersonSuitable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dish, totalPersonSuitable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FavoritesResponse {\n");
    
    sb.append("    dish: ").append(toIndentedString(dish)).append("\n");
    sb.append("    totalPersonSuitable: ").append(toIndentedString(totalPersonSuitable)).append("\n");
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

