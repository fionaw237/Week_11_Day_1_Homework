import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume(){
        int volume = waterBottle.getVolume();
        assertEquals(100, volume);
    }

    @Test
    public void drinkFunctionRemovesLiquid(){
        waterBottle.drink();
        int newVolume = waterBottle.getVolume();
        assertEquals(90, newVolume);
    }

    @Test
    public void canEmptyBottle(){
        waterBottle.empty();
        int newVolume = waterBottle.getVolume();
        assertEquals(0, newVolume);
    }

    @Test
    public void canRefillBottle(){
        waterBottle.refill();
        int newVolume = waterBottle.getVolume();
        assertEquals(100, newVolume);
    }
}
