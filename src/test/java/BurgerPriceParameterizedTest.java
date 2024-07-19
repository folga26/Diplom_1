import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class BurgerPriceParameterizedTest {

    private final Ingredient ingredient;
    private static float price;

    public BurgerPriceParameterizedTest(Ingredient ingredient, float price) {
        this.ingredient = ingredient;
        this.price = price;
    }

   @Parameterized.Parameters
    public static Object[][] data() {
       return new Object[][]{
               {new Ingredient(IngredientType.SAUCE, "hot sauce", 100), price = 300},
               {new Ingredient(IngredientType.SAUCE, "sour cream", 200), price = 400},
               {new Ingredient(IngredientType.SAUCE, "chili sauce", 300), price = 500},
               {new Ingredient(IngredientType.FILLING, "cutlet", 100), price = 300},
               {new Ingredient(IngredientType.FILLING, "dinosaur", 200), price = 400},
               {new Ingredient(IngredientType.FILLING, "sausage", 300), price = 500}
       };
   }

    @Test
    public void testGetPriceParameterized() {

        Burger burger = new Burger();
        Bun bun = new Bun("black bun", 100);
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        assertEquals(price, burger.getPrice(), 1);
        System.out.println("Ожидаемая цена: " + price + ". Цена из метода: " + burger.getPrice());
    }

}








