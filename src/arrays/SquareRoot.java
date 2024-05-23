package arrays;

public class SquareRoot {

    public static void squareRoot(int a){
        double c=Math.sqrt(a);
        System.out.println(c);
    }

    public static double square(double number){
        double t;
        double squareroot = number / 2;
        do
        {
            t = squareroot;
            squareroot = (t + (number / t)) / 2;
        }
        while ((t - squareroot) != 0);
        return squareroot;
    }


    public static void main(String[] args) {

        int a=121;
        squareRoot(a);
        double z=square(a);
        System.out.println(z);

    }
}
