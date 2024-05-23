package Homwork;

public class numPalindrom {
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String s=String.valueOf(x);
        char[] A=s.toCharArray();
        int n=A.length;
        for(int i=0,j=n-1;i<j;i++,j--){
            if(A[i]!=A[j])
                return false;
        }
        return true;

    }

    public static boolean isPalindromeNum(int x) {
        // Special cases:
        // When x is negative, it is not a palindrome.
        // When x ends with 0 but is not 0, it is not a palindrome.
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        // Reverse the second half of the number
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        // If the number is a palindrome, the reversed half should be equal to the original half
        // For odd number of digits, we can remove the middle digit by reversedHalf / 10
        return x == reversedHalf || x == reversedHalf / 10;
    }

    public static void main(String[] args) {
         int x=50005;
        System.out.println(isPalindromeNum(x));
    }
}

/*E xample Walkthrough
        Let's take an example with x = 12321:
        Initial State:

        x = 12321
        reversedHalf = 0
        First Iteration:

        Last digit of x: 12321 % 10 = 1
        Update reversedHalf: 0 * 10 + 1 = 1
        Remove the last digit from x: 12321 / 10 = 1232
        Now, x = 1232 and reversedHalf = 1
        Second Iteration:

        Last digit of x: 1232 % 10 = 2
        Update reversedHalf: 1 * 10 + 2 = 12
        Remove the last digit from x: 1232 / 10 = 123
        Now, x = 123 and reversedHalf = 12
        Third Iteration:

        Last digit of x: 123 % 10 = 3
        Update reversedHalf: 12 * 10 + 3 = 123
        Remove the last digit from x: 123 / 10 = 12
        Now, x = 12 and reversedHalf = 123
        Exit Loop:

        The loop condition x > reversedHalf is no longer true (12 is not greater than 123), so we exit the loop.
        Final Comparison
        After exiting the loop, we need to compare the two halves:

        For even-length numbers, x should be equal to reversedHalf.
        For odd-length numbers, the middle digit is ignored by dividing reversedHalf by 10 (reversedHalf / 10).
        In our example:

        Since x = 12 and reversedHalf = 123, we need to check x == reversedHalf / 10, which is 12 == 123 / 10, i.e., 12 == 12. This condition is true, so 12321 is a palindrome.*/