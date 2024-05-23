package arrays;
import static java.lang.Math.log10;
import static java.lang.Math.pow;
//Armstrong numbers are those whose sum of each digit raised to the
// power count of digits is equal to the number itself
public class ArmStrongNumber {       //   1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296  +81 + 256 =  1634
    public static int armStrong(int n){
        int count=(int) (log10(n)+1);
        System.out.println(count);
        int sum=0;
        while(n>0){
            int ld=n%10;   // extracting last digit
            sum= (int) (sum+pow(ld,count));
            n=n/10;    // removing last digit
        }
        return sum;
    }

    public static void main(String[] args) {

        int c=armStrong(1634);
        System.out.println(c);


    }
}
