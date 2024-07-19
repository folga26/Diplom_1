import org.junit.Test;

import praktikum.Ingredient;

import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.SAUCE;

public class IngredientTest {

    @Test
    public void testGetIngredientPrice() {
        Ingredient ingredient = new Ingredient(SAUCE, "sour cream", 200);
        assertEquals(200F, ingredient.getPrice(), 1);
    }

    @Test
    public void testGetIngredientName() {
        Ingredient ingredient = new Ingredient(SAUCE, "sour cream", 200);
        assertEquals("sour cream", ingredient.getName());
    }

    @Test
    public void testGetIngredientType() {
        Ingredient ingredient = new Ingredient(SAUCE, "sour cream", 200);
        assertEquals(SAUCE, ingredient.getType());
    }

}
