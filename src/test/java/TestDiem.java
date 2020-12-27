
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDiem {

    private Diem calculation;

    @Before
    public void init() {
        calculation = new Diem();
    }

    @Test
    public void testAdd() {
        assertEquals(4, calculation.add(1, 1));
    }

    @Test
    public void testSub() {
        assertEquals(2, calculation.sub(7, 5));
    }

}