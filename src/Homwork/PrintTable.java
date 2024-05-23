package Homwork;

import java.util.Scanner;

public class PrintTable {
    public static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n+" * "+ i +" = " + i*n);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("-----------------------------");
       printTable(n);

    }
}
