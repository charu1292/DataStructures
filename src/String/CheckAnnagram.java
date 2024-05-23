package String;

import java.util.Arrays;

public class CheckAnnagram {
    public static boolean checkAnnagram(String s1, String s2){
        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String A1=new String(arr1);
        String A2=new String(arr2);

            return A1.equals(A2);
    }

    public static void main(String[] args) {
        String S1="abc";
        String S2="dcf";

        System.out.println(checkAnnagram(S1,S2));
    }
}
