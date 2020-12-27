
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
    private String filePath = "TamGiac.xml";
    private ArrayList<ArrayList<String>> listTestCase;
    private TamGiac setTamgiac(ArrayList testcase )
    {
        int Ax = Integer.parseInt((String) testcase.get(0));
        int Ay = Integer.parseInt((String) testcase.get(1));
        int Bx = Integer.parseInt((String) testcase.get(2));
        int By = Integer.parseInt((String) testcase.get(3));
        int Cx = Integer.parseInt((String) testcase.get(4));
        int Cy = Integer.parseInt((String) testcase.get(5));
        return  new TamGiac(new Diem(Ax,Ay), new Diem(Bx,By), new Diem(Cx, Cy));
    }
    @Rule
    @Before
    public void init() {
        File xmlFile = new File(filePath);
        listTestCase = new ArrayList<ArrayList<String>>();
        // Ax,Ay,Bx,By,Cx,Cy,ChuVi,Loai
        listTestCase.add(new ArrayList<String>(Arrays.asList("1", "3", "4", "4", "4", "4", "124", "Vuong")));
        listTestCase.add(new ArrayList<String>(Arrays.asList("1", "1", "1", "1", "4", "4", "124", "Vuong")));
        listTestCase.add(new ArrayList<String>(Arrays.asList("1", "3", "4", "4", "4", "4", "124", "Vuong")));
        listTestCase.add(new ArrayList<String>(Arrays.asList("1", "3", "4", "4", "4", "4", "124", "Vuong")));
        listTestCase.add(new ArrayList<String>(Arrays.asList("1", "3", "4", "4", "4", "4", "124", "Vuong")));
        listTestCase.add(new ArrayList<String>(Arrays.asList("1", "3", "4", "4", "4", "4", "124", "Vuong")));
        listTestCase.add(new ArrayList<String>(Arrays.asList("1", "3", "4", "4", "4", "4", "124", "Vuong")));
        listTestCase.add(new ArrayList<String>(Arrays.asList("1", "3", "4", "4", "4", "4", "124", "Vuong")));
        listTestCase.add(new ArrayList<String>(Arrays.asList("1", "3", "4", "4", "4", "4", "124", "Vuong")));
        listTestCase.add(new ArrayList<String>(Arrays.asList("1", "3", "4", "4", "4", "4", "124", "Vuong")));
        listTestCase.add(new ArrayList<String>(Arrays.asList("1", "3", "4", "4", "4", "4", "124", "Vuong")));
        listTestCase.add(new ArrayList<String>(Arrays.asList("1", "3", "4", "4", "4", "4", "124", "Vuong")));
        listTestCase.add(new ArrayList<String>(Arrays.asList("1", "3", "4", "4", "4", "4", "124", "Vuong")));
        listTestCase.add(new ArrayList<String>(Arrays.asList("1", "3", "4", "4", "4", "4", "124", "Vuong")));
    }
    @Test
    public void testDoDaiCanh1() {
        int j = 0;
        while (listTestCase.size() > j) {
            ArrayList<String> testCase = listTestCase.get(j);
            tamgiac = setTamgiac(testCase);
            tamgiac.TinhDoDaiCanh();
            j++;
        }
    }
    @Test
    public void testDoDaiCanh2() {
        tamgiac = new TamGiac(new Diem(1,5), new Diem(2,6), new Diem(6,2));
        tamgiac.TinhDoDaiCanh();
        assertEquals(true,tamgiac.dodaicanh2 > 0);
    }
    @Test
    public void testDoDaiCanh3() {
        tamgiac = new TamGiac(new Diem(1,5), new Diem(2,6), new Diem(6,2));
        tamgiac.TinhDoDaiCanh();
        assertEquals(true,tamgiac.dodaicanh3 > 0);
    }

    @Test
    public void DieuKienTamGiac() {
        tamgiac = new TamGiac(new Diem(1,5), new Diem(2,6), new Diem(6,2));
        tamgiac.TinhDoDaiCanh();
        assertTrue("Điều kiện tam giác ", tamgiac.DieuKienTamGiac());
    }

//    @Test
//    public void testY() {
//    }
//    @Test
//    public void testY() {
//    }
//    @Test
//    public void testY() {
//    }
//    @Test
//    public void testY() {
//    }
//    @Test
//    public void testY() {
//    }
}
