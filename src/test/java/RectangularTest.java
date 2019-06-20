import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangularTest {
    private Rectangular rectangular;


    @Before
    public void setUp() throws Exception {
        rectangular = new Rectangular(10, 8);
    }

    @Test
    public void should_get_perimeter_successfully() {
        assertEquals(36, rectangular.getPerimeter());
    }

    @Test
    public void should_get_area_successfully() {
        assertEquals(80, rectangular.getArea());
    }
}