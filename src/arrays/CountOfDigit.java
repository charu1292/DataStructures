package arrays;

import static java.lang.Math.log10;

public class CountOfDigit {

    public static int extraction(int n){

        return (int) (log10(n)+1);
    }

    public static void main(String[] args) {

        int c=extraction(7833396);
        System.out.println(c);

    }
}
