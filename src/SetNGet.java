class A{
    private int r;
    private int v;

                           // (r) = √(V / π × h)
    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getV() {
        return v;
    }

    public void setV(int V) {
        this.v = v;
    }
}
public class SetNGet {
    public static void main(String[] args) {
        A obj=new A();

        obj.setR(3);   obj.setR(5);

        System.out.println(obj.getV()); System.out.println(obj.getV());
    }
}





