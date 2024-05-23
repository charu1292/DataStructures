package Homwork;

import java.util.Scanner;

public class CheckEven {
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int n=sc.nextInt();
        System.out.println("-----------------------------");
        System.out.println("Result : " + isEven(n));
    }
}
