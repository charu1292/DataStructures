package arrays;

public class CheckArrayPalindrome {

    public static boolean checkPalindrome(int[] A) {
       int n=A.length;
       if(n==0)
           return false;
       for(int i=0,j=n-1;i<j;i++,j--){
           if(A[i]!=A[j])
               return false;

       }
        return true;
    }


    public static void main(String[] args) {
        int[] A={22,33,33,22};
        boolean result=checkPalindrome(A);
        if (result)
            System.out.println("it is palindrome");
        else
            System.out.println("not a palindrome");
    }
}
