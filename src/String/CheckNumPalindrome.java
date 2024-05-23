package String;

public class CheckNumPalindrome {

        public static String Reverse(String a){
            char[] A=a.toCharArray();
            int n=A.length;
            for (int i=0,j=n-1;i<j;i++,j--) {
                A[i] = (char) (A[i] + A[j]);
                A[j] = (char) (A[i] - A[j]);
                A[i] = (char) (A[i] - A[j]);
            }
            return new String(A);
        }


        public static void main(String[] args) {
            String S="22";
            String reversed=Reverse(S);
            if(reversed.equals(S))
                System.out.println("num is palindrome");

        }
    }


