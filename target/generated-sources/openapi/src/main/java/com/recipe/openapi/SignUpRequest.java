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
 * Json object received in Sign-up requests
 */
@ApiModel(description = "Json object received in Sign-up requests")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T17:27:29.458741200-03:00[America/Sao_Paulo]")
public class SignUpRequest   {
  @JsonProperty("username")
  private String username;

  @JsonProperty("password")
  private String password;

  public SignUpRequest username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Username that will be used in the login
   * @return username
  */
  @ApiModelProperty(example = "usernameabc", required = true, value = "Username that will be used in the login")
  @NotNull


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public SignUpRequest password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Password that will be used in the login
   * @return password
  */
  @ApiModelProperty(example = "abc123", required = true, value = "Password that will be used in the login")
  @NotNull


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignUpRequest signUpRequest = (SignUpRequest) o;
    return Objects.equals(this.username, signUpRequest.username) &&
        Objects.equals(this.password, signUpRequest.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignUpRequest {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

