package Patterns;

import java.util.Scanner;
//        1
//      2 1 2
//    3 2 1 2 3
//  4 3 2 1 2 3 4
//5 4 3 2 1 2 3 4 5
//
//Process finished with exit code 0

public class MirrorPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        System.out.println("______________________");
        for (int i=1; i<=n; i++){
            //spaces
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            //first part
            for (int j=i; j>=1; j--){
                System.out.print(j+" ");
            }
            //second part
            for (int j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

