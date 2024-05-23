package Homwork;

import java.util.Scanner;

public class CheckNumberPrime {
    public static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Result : " + isPrime(n) );
    }
}
