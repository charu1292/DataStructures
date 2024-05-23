package Homwork;

import java.util.Scanner;

public class CalculateAverage {
    public static int calAvg(int m,int n,int o){
        int avg=(m+n+o)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n =sc.nextInt();
        System.out.println();
        System.out.print("Enter Second Number: ");
        int m =sc.nextInt();
        System.out.println();
        System.out.print("Enter third Number: ");
        int o=sc.nextInt();
        System.out.println("---------------------------");
        System.out.println(calAvg(m,n,o));
    }
}
