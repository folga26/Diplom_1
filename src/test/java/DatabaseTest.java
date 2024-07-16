import org.junit.Test;
import praktikum.Database;

import static org.junit.Assert.assertEquals;

public class DatabaseTest {

    @Test
    public void testAvailableBuns() {
        Database database = new Database();
        String results = database.availableBuns().toString();
        assertEquals(results, database.availableBuns().toString());
    }

    @Test
    public void testAvailableIngredients() {
        Database database = new Database();
        String results = database.availableIngredients().toString();
        assertEquals(results, database.availableIngredients().toString());
    }
}
