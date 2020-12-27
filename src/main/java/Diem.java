public class Diem {
    public int x;
    public  int y;
    public  Diem(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public double dodaidendiem(Diem B)
    {
        double dodai = Math.sqrt( Math.pow(x-B.x,2) + Math.pow(y-B.y,2));
        return dodai;
    }
}