import org.junit.Test;

import static org.junit.Assert.*;

public class RectangularTest {

    @Test
    public void should_get_perimeter_successfully() {

        Rectangular rectangular=new Rectangular();
        rectangular.setLength(10);
        rectangular.setWidth(8);

        assertEquals(36,rectangular.getPerimeter());
    }

    @Test
    public void should_get_area_successfully() {
        Rectangular rectangular=new Rectangular();
        rectangular.setLength(10);
        rectangular.setWidth(8);

        assertEquals(80,rectangular.getArea());
    }
}