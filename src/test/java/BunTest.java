import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class BunTest {

    @Mock
    Bun mockBun;

    @Test
    public void testGetBunName() {
        Bun bun = new Bun("black bun", 100);
        System.out.println(bun.getName());
    }

    @Test
    public void testGetBunPrice(){
        Bun bun = new Bun("black bun", 100);
        Mockito.when(mockBun.getPrice()).thenReturn(100F);
        assertEquals(100F, bun.getPrice(), 1);
        System.out.println(mockBun.getPrice());
    }

}
