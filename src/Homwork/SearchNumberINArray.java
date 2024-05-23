package Homwork;
// take input from array and search in array and return the index

import java.util.Scanner;

public class SearchNumberINArray {

    public static int searchNumber(int[] A,int x){
        for (int i=0; i<A.length; i++){
            if(x==A[i]){
            return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size=sc.nextInt();
        int[] A=new int[size];
        //input array numbers
        System.out.print("Enter the numbers: ");
        for (int i=0; i<size; i++){
            A[i]=sc.nextInt();
        }
        System.out.println("Enter the number you want to found: ");
        int x=sc.nextInt();

        //outout
        int z=searchNumber(A,x);
        System.out.println("Number found at :" + z);
    }
}
