public class Diem {
    public double x;
    public  double y;
    public  Diem(double x, double y)
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