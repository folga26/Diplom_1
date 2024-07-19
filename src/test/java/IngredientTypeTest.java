import org.junit.Test;
import praktikum.IngredientType;

import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;


public class IngredientTypeTest {

    @Test
    public void testGetIngredientTypeEnumValue() {
        assertThat(SAUCE, IngredientType.SAUCE);
        assertThat(FILLING, IngredientType.FILLING);
        System.out.println(SAUCE);
        System.out.println(FILLING);
    }

    private void assertThat(IngredientType ingredientType, IngredientType ingredientType1) {
    }

}
