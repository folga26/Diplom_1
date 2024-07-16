import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;

import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

@RunWith(MockitoJUnitRunner.class)

public class BurgerTest {

    @Mock
    Bun mockBun;

    @Test
    public void testGetPrice() {

        Burger burger = new Burger();
        Ingredient ingredient = new Ingredient(SAUCE, "sour cream", 200);
        this.mockBun = new Bun("black bun", 100);
        burger.setBuns(mockBun);
        burger.addIngredient(ingredient);
        assertEquals(400F, burger.getPrice(), 1);
    }


    @Test
    public void testGetReceipt() {

        Burger burger = new Burger();
        Ingredient firstIngredient = new Ingredient(SAUCE, "sour cream", 200);
        Ingredient secondIngredient = new Ingredient(FILLING, "cutlet", 100);
        Ingredient thirdIngredient = new Ingredient(FILLING, "dinosaur", 200);
        this.mockBun = new Bun("black bun", 100);
        burger.setBuns(mockBun);
        burger.addIngredient(firstIngredient);
        burger.addIngredient(secondIngredient);
        burger.addIngredient(thirdIngredient);
        burger.removeIngredient(2);
        burger.moveIngredient(0, 1);
        assertEquals(
                "(==== black bun ====)\r\n= filling cutlet =\r\n= sauce sour cream =\r\n(==== black bun ====)\r\n\r\nPrice: 500,000000\r\n",
                burger.getReceipt().toString());
    }

}








