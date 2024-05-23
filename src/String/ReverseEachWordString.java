package String;

public class ReverseEachWordString {

    public static String ReverseWord(String S){
        String[] words=S.split(" ");
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<words.length;i++){
            StringBuilder ss=new StringBuilder(words[i]);
            for(int k=0,j=ss.length()-1;k<j;k++,j--)
            {
                char t= ss.charAt(k);
                ss.setCharAt(k,ss.charAt(j));
                ss.setCharAt(j,t);
            }
            sb.append(ss);
            sb.append(" ");
        }
        return sb.toString();
    }

    public static String ReverseUsingSubstring(String S) {
        int i = 0;
        int j = 0;
        char[] arr = S.toCharArray();
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
        String s="i Have no more    patience";
        String ReverseString=ReverseUsingSubstring(s);
        System.out.println(ReverseString);
    }
}
