package com.recipe.openapi;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Json object received in create and update recipe requests
 */
@ApiModel(description = "Json object received in create and update recipe requests")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T17:27:29.458741200-03:00[America/Sao_Paulo]")
public class RecipeResponse   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("dish")
  private String dish;

  @JsonProperty("dateAndTimeOfCreation")
  private String dateAndTimeOfCreation;

  @JsonProperty("isVegetarian")
  private Boolean isVegetarian;

  @JsonProperty("ingredients")
  @Valid
  private List<String> ingredients = null;

  @JsonProperty("cookingInstructions")
  private String cookingInstructions;

  @JsonProperty("totalPersonSuitable")
  private Integer totalPersonSuitable;

  public RecipeResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The recipe id
   * @return id
  */
  @ApiModelProperty(value = "The recipe id")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RecipeResponse dish(String dish) {
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

  public RecipeResponse dateAndTimeOfCreation(String dateAndTimeOfCreation) {
    this.dateAndTimeOfCreation = dateAndTimeOfCreation;
    return this;
  }

  /**
   * Date and time of the recipe creation
   * @return dateAndTimeOfCreation
  */
  @ApiModelProperty(example = "29-05-2021 10:00", value = "Date and time of the recipe creation")


  public String getDateAndTimeOfCreation() {
    return dateAndTimeOfCreation;
  }

  public void setDateAndTimeOfCreation(String dateAndTimeOfCreation) {
    this.dateAndTimeOfCreation = dateAndTimeOfCreation;
  }

  public RecipeResponse isVegetarian(Boolean isVegetarian) {
    this.isVegetarian = isVegetarian;
    return this;
  }

  /**
   * Indicates if dish is vegetarian
   * @return isVegetarian
  */
  @ApiModelProperty(example = "false", value = "Indicates if dish is vegetarian")


  public Boolean getIsVegetarian() {
    return isVegetarian;
  }

  public void setIsVegetarian(Boolean isVegetarian) {
    this.isVegetarian = isVegetarian;
  }

  public RecipeResponse ingredients(List<String> ingredients) {
    this.ingredients = ingredients;
    return this;
  }

  public RecipeResponse addIngredientsItem(String ingredientsItem) {
    if (this.ingredients == null) {
      this.ingredients = new ArrayList<>();
    }
    this.ingredients.add(ingredientsItem);
    return this;
  }

  /**
   * The list of ingredients items
   * @return ingredients
  */
  @ApiModelProperty(value = "The list of ingredients items")


  public List<String> getIngredients() {
    return ingredients;
  }

  public void setIngredients(List<String> ingredients) {
    this.ingredients = ingredients;
  }

  public RecipeResponse cookingInstructions(String cookingInstructions) {
    this.cookingInstructions = cookingInstructions;
    return this;
  }

  /**
   * Describe the steps of coking
   * @return cookingInstructions
  */
  @ApiModelProperty(value = "Describe the steps of coking")


  public String getCookingInstructions() {
    return cookingInstructions;
  }

  public void setCookingInstructions(String cookingInstructions) {
    this.cookingInstructions = cookingInstructions;
  }

  public RecipeResponse totalPersonSuitable(Integer totalPersonSuitable) {
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
    RecipeResponse recipeResponse = (RecipeResponse) o;
    return Objects.equals(this.id, recipeResponse.id) &&
        Objects.equals(this.dish, recipeResponse.dish) &&
        Objects.equals(this.dateAndTimeOfCreation, recipeResponse.dateAndTimeOfCreation) &&
        Objects.equals(this.isVegetarian, recipeResponse.isVegetarian) &&
        Objects.equals(this.ingredients, recipeResponse.ingredients) &&
        Objects.equals(this.cookingInstructions, recipeResponse.cookingInstructions) &&
        Objects.equals(this.totalPersonSuitable, recipeResponse.totalPersonSuitable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dish, dateAndTimeOfCreation, isVegetarian, ingredients, cookingInstructions, totalPersonSuitable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipeResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dish: ").append(toIndentedString(dish)).append("\n");
    sb.append("    dateAndTimeOfCreation: ").append(toIndentedString(dateAndTimeOfCreation)).append("\n");
    sb.append("    isVegetarian: ").append(toIndentedString(isVegetarian)).append("\n");
    sb.append("    ingredients: ").append(toIndentedString(ingredients)).append("\n");
    sb.append("    cookingInstructions: ").append(toIndentedString(cookingInstructions)).append("\n");
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

