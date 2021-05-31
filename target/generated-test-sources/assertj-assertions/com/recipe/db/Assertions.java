package com.recipe.db;

/**
 * Entry point for assertions of different data types. Each method in this class is a static factory for the
 * type-specific assertion objects.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class Assertions {

  /**
   * Creates a new instance of <code>{@link com.recipe.db.FavoriteAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  @org.assertj.core.util.CheckReturnValue
  public static com.recipe.db.FavoriteAssert assertThat(com.recipe.db.Favorite actual) {
    return new com.recipe.db.FavoriteAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link com.recipe.db.LoginAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  @org.assertj.core.util.CheckReturnValue
  public static com.recipe.db.LoginAssert assertThat(com.recipe.db.Login actual) {
    return new com.recipe.db.LoginAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link com.recipe.db.RecipeDataAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  @org.assertj.core.util.CheckReturnValue
  public static com.recipe.db.RecipeDataAssert assertThat(com.recipe.db.RecipeData actual) {
    return new com.recipe.db.RecipeDataAssert(actual);
  }

  /**
   * Creates a new <code>{@link Assertions}</code>.
   */
  protected Assertions() {
    // empty
  }
}
