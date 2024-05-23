package arrays;

import static java.lang.Math.min;

public class GCD {

    public static void gcd(int n1,int n2) {
        int gcd = 1;
        for (int i = 1; i < (min(n1, n2)); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd=i;
            }
        }
        System.out.println("GCD of " + n1 + " and " + n2 + " "+ gcd);
    }

    public static void main(String[] args) {
        int n1=12;
        int n2=8;
        gcd(n1,n2);
    }
}
