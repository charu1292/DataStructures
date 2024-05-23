package Homwork;
import java.util.*;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String action = sc.next();
        switch (action) {
            case ("add"): {
                System.out.println("sum is " + (a + b));
                break;
            }
            case ("minus"): {
                System.out.println("diff is " + (a - b));
                break;
            }
            case ("multiply"): {
                System.out.println("multiply is " + (a * b));
                break;
            }
            case ("Divide"): {
                if(b == 0) {
                    System.out.println("Invalid Division");
                } else {
                    System.out.println("Quotient is " + (a/b));
                }
                break;
            }
            case ("Modulo"): {
                if(b == 0) {
                    System.out.println("Invalid action");
                } else {
                    System.out.println("remainder is "+ (a%b));
                }

                break;
            }
            default:
                System.out.println("No action found");
        }
    }
}
