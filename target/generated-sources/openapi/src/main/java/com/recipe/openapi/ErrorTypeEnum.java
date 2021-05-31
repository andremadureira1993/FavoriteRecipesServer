package com.recipe.openapi;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * The type of the error. Supported values are CONFIGURATION, DATABASE, INTERNAL, INVALID_REQUEST, and MAPPING.
 */
public enum ErrorTypeEnum {
  
  CONFIGURATION("CONFIGURATION"),
  
  DATABASE("DATABASE"),
  
  INTERNAL("INTERNAL"),
  
  INVALID_REQUEST("INVALID_REQUEST"),
  
  MAPPING("MAPPING");

  private String value;

  ErrorTypeEnum(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ErrorTypeEnum fromValue(String value) {
    for (ErrorTypeEnum b : ErrorTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

