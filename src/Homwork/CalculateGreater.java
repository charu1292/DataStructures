package Homwork;

import java.util.Scanner;

public class CalculateGreater {

    public static int calGreater(int m,int n){
        if(m>n){
            return m;
        }
        return n;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number m :  ");
        int m=sc.nextInt();
        System.out.println("Enter the number n :  ");
        int n=sc.nextInt();
        System.out.println("Greater Number is: "+ calGreater(m,n));

    }
}
