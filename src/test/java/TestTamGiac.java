
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
public class TestTamGiac {
    private  TamGiac tamgiac;
    private double ChuViExpect;
    @Before
    public void init() {
        int Ax = 1;
        int Bx = 5;
        int Cx = 2;
        int Ay = 6;
        int By = 5;
        int Cy = 6;
        ChuViExpect = 8.28538328578604;
        tamgiac = new TamGiac(new Diem(Ax,Ay), new Diem(Bx,By), new Diem(Cx,Cy));
        tamgiac.TinhDoDaiCanh();
    }
    @Test
    public void testDoDaiCanh1() {
            assertEquals("Do Dai 1",true,tamgiac.dodaicanh1 > 0);
    }
    @Test
    public void testDoDaiCanh2() {
        assertEquals("Do Dai 2",true,tamgiac.dodaicanh2 > 0);
    }
    @Test
    public void testDoDaiCanh3() {

        assertEquals("Do Dai 3",true,tamgiac.dodaicanh3 > 0);
    }
    @Test
    public void DieuKienTamGiac() {
        assertTrue("Điều kiện tam giác ", tamgiac.DieuKienTamGiac());
    }
    @Test
    public void  ChuViTamGiac()
    {
        assertEquals("Chu vi : ",ChuViExpect, tamgiac.ChuViTamGiac(), 0);
    }
}
