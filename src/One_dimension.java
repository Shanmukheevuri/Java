public class One_dimension {
    public static void logical1(int a, int b) {

        int difference;
        if (a >= b) {
            difference = (a - b);
            System.out.println(difference);

        } else {  
            difference = (b - a);
            System.out.println(difference);
        }
    }

    public static void main(String[] args) {
        System.out.println("Logical1:" );
               logical1(5,200);

    }



}
