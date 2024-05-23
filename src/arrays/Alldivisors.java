package arrays;

import java.util.ArrayList;
import java.util.List;

public class Alldivisors {
    public static void print_divisors(int n){
        for(int i=1;i<n;i++){
            if(n%i==0) {
                System.out.print(i + ",");
            }
        }
    }
    public static int[] getDivisors(int n) {
        List<Integer> divisorList = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                divisorList.add(i);
            }
        }
        int[] divisors = new int[divisorList.size()];
        for (int i = 0; i < divisors.length; i++) {
            divisors[i] = divisorList.get(i);
        }
        return divisors;
    }

    public static void main(String[] args) {
        int n =36;
        print_divisors(n);
        System.out.println();

        int[] divisors = getDivisors(n);
        for (int divisor : divisors) {
            System.out.print(divisor + ",");
        }
    }
}
