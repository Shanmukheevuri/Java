// 2. wpj to pass the radius of a circle in a customise method and return the
// area in the main method.

public class Cricle extends factorial {
    public double raduis(double r) {

        double area = Math.PI * r * r;

        return (area);
    }


    public static void main(String[] args) {
        Cricle circle = new Cricle();
        System.out.println(circle.raduis(3));
        factorial f = new factorial();

    }
}