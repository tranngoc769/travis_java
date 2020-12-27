public class TamGiac {
    public  Diem diem1;
    public  Diem diem2;
    public  Diem diem3;
    public  double dodaicanh1;
    public  double dodaicanh2;
    public  double dodaicanh3;
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
        return  dodaicanh1 + dodaicanh2 + dodaicanh3;
    }
}