package com.recipe.db;

/**
 * {@link Login} specific assertions - Generated by CustomAssertionGenerator.
 *
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it, 
 * extend {@link AbstractLoginAssert} instead.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class LoginAssert extends AbstractLoginAssert<LoginAssert, Login> {

  /**
   * Creates a new <code>{@link LoginAssert}</code> to make assertions on actual Login.
   * @param actual the Login we want to make assertions on.
   */
  public LoginAssert(Login actual) {
    super(actual, LoginAssert.class);
  }

  /**
   * An entry point for LoginAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myLogin)</code> and get specific assertion with code completion.
   * @param actual the Login we want to make assertions on.
   * @return a new <code>{@link LoginAssert}</code>
   */
  @org.assertj.core.util.CheckReturnValue
  public static LoginAssert assertThat(Login actual) {
    return new LoginAssert(actual);
  }
}
