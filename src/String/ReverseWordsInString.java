package String;

import java.util.Arrays;

public class ReverseWordsInString {

    public static String reverseWordUsingSplit(String s){
        String[] words=s.split(" +");
        StringBuilder sb=new StringBuilder();
        for (int i= words.length-1;i>=0;i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static String reverseWordUsingSubString(String S) {
        int i = 0;
        int j = 0;
        char[] arr = S.toCharArray();
        Reverse(arr,i,arr.length-1);
        while (i < arr.length) {
            while (j < arr.length && arr[j] != ' ') {// increment j till j hmara space nahi hai
                j++;
            }
            Reverse(arr,i,j-1);
            while (j < arr.length && arr[j]== ' ') {// increment j till j hmara space hai
                j++;
            }
            i=j;
        }
        return new String(arr);
    }

    static void Reverse(char[] arr,int i,int j){
        while(i<j){
            char temp;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }

    public static void main(String[] args) {
        String s="I like this Program very    much              ";
        //output: much very program this like I

        String Reversed = reverseWordUsingSplit(s);
        System.out.print("reverse using split: " + Reversed);
        System.out.println();
        String reversedSubstring = reverseWordUsingSubString(s);
        System.out.println("reverse using substring: " + reversedSubstring);
    }

}
