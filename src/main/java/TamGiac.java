import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TamGiac {
    public  Diem diem1;
    public  Diem diem2;
    public  Diem diem3;
    public  double dodaicanh1 = 0;
    public  double dodaicanh2 = 0;
    public  double dodaicanh3 = 0;
    public TamGiac(Diem A, Diem B, Diem C)
    {
        this.diem2 = B;
        this.diem1 = A;
        this.diem3 = C;
    }
    public void TinhDoDaiCanh()
    {
        dodaicanh1 = diem1.dodaidendiem(diem2);
        dodaicanh2 = diem2.dodaidendiem(diem3);
        dodaicanh3 = diem3.dodaidendiem(diem1);
    }
    public  boolean DieuKienTamGiac()
    {
        if (dodaicanh1+dodaicanh2> dodaicanh3 & dodaicanh1+dodaicanh3 > dodaicanh2 & dodaicanh2+ dodaicanh3 > dodaicanh1)
        {
            return true;
        }
        return false;
    }

    public double ChuViTamGiac()
    {
        return Math.ceil( (dodaicanh1 + dodaicanh2 + dodaicanh3) * 100) / 100;
    }
    public int LoaiTamGiac()
    {
        if (!this.DieuKienTamGiac())
        {
            return 0;
        }
//        1 : Deu , 2 : can  , 3 : VUong , 4 Vuong dodaicanh3 an  : Thuong

        if (dodaicanh1 == Math.ceil(dodaicanh2) && Math.ceil(dodaicanh2) == Math.ceil(dodaicanh3 )) {
            return 1;
        }
        if ((dodaicanh1 == dodaicanh2 && dodaicanh2 != dodaicanh3  && Math.ceil(2 * dodaicanh1 * dodaicanh1) == Math.ceil(dodaicanh3  * dodaicanh3))
                || (dodaicanh2 == dodaicanh3  && dodaicanh3  != dodaicanh1 &&Math.ceil(2 * dodaicanh2 * dodaicanh2) ==Math.ceil( dodaicanh1 * dodaicanh1))
                || (dodaicanh1 == dodaicanh3  && dodaicanh3  != dodaicanh2 && Math.ceil(2 * dodaicanh3  * dodaicanh3 ) == Math.ceil(dodaicanh2 * dodaicanh2))) {
            return 4;
        }
        if ((dodaicanh1 == dodaicanh2 && dodaicanh2 != dodaicanh3 ) || (dodaicanh2== dodaicanh3  && dodaicanh3  != dodaicanh1)
                || (dodaicanh1 == dodaicanh3  && dodaicanh3  != dodaicanh2)) {
            return 2;
        }
        double a = Math.floor((dodaicanh1 * dodaicanh1 + dodaicanh2 * dodaicanh2)*100) / 100;
        double b = Math.floor((dodaicanh3  * dodaicanh3 )*100) / 100;
        if (a ==b) return 3;
        a = Math.floor((dodaicanh1 * dodaicanh1 + dodaicanh3  * dodaicanh3)*100) / 100;
        b = Math.floor((dodaicanh2 * dodaicanh2 )*100) / 100;
        if (a ==b) return 3;
         a = Math.floor((dodaicanh2 * dodaicanh2 + dodaicanh3  * dodaicanh3)*100) / 100;
        b = Math.floor((dodaicanh1 * dodaicanh1 )*100) / 100;
        if (a==b) return  3;
        return 5;
    }
}