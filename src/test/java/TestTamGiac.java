
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
    private int loaiExpect = 1;
    @Before
    public void init() {
//        1 : Deu , 2 : Can  , 3 : VUong , 4 Vuong Can  : Thuong
        Double[] arr = new Double[]{ 0.0,0.0,0.0,0.0,0.0,0.0};
        ChuViExpect = 28.971;
        loaiExpect = 4;
        ChuViExpect = Math.floor(ChuViExpect * 100) / 100;
        double Ax = arr[0];
        double Ay = arr[1];
        double Bx = arr[2];
        double By = arr[3];
        double Cx = arr[4];
        double Cy = arr[5];
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
        assertEquals("Chu vi : ",ChuViExpect, tamgiac.ChuViTamGiac(), 2);
    }
    @Test
    public void LoaiTamGiac()
    {
        assertEquals("Loai Tam Giac: ",loaiExpect, tamgiac.LoaiTamGiac());
    }
}
