package Patterns;
import java.util.*;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        int number=1;
        System.out.println("Here is the pyramid");
        for(int i=1;i<=n; i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(number + " ");
            }
            number++;
            System.out.println();
        }
    }
}
