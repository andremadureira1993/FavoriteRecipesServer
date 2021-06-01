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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T22:56:01.260710800-03:00[America/Sao_Paulo]")
public class Recipe   {
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

  public Recipe dish(String dish) {
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

  public Recipe dateAndTimeOfCreation(String dateAndTimeOfCreation) {
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

  public Recipe isVegetarian(Boolean isVegetarian) {
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

  public Recipe ingredients(List<String> ingredients) {
    this.ingredients = ingredients;
    return this;
  }

  public Recipe addIngredientsItem(String ingredientsItem) {
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

  public Recipe cookingInstructions(String cookingInstructions) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Recipe recipe = (Recipe) o;
    return Objects.equals(this.dish, recipe.dish) &&
        Objects.equals(this.dateAndTimeOfCreation, recipe.dateAndTimeOfCreation) &&
        Objects.equals(this.isVegetarian, recipe.isVegetarian) &&
        Objects.equals(this.ingredients, recipe.ingredients) &&
        Objects.equals(this.cookingInstructions, recipe.cookingInstructions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dish, dateAndTimeOfCreation, isVegetarian, ingredients, cookingInstructions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recipe {\n");
    
    sb.append("    dish: ").append(toIndentedString(dish)).append("\n");
    sb.append("    dateAndTimeOfCreation: ").append(toIndentedString(dateAndTimeOfCreation)).append("\n");
    sb.append("    isVegetarian: ").append(toIndentedString(isVegetarian)).append("\n");
    sb.append("    ingredients: ").append(toIndentedString(ingredients)).append("\n");
    sb.append("    cookingInstructions: ").append(toIndentedString(cookingInstructions)).append("\n");
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

