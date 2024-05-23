package String;

public class ReverseString {

    public static String reverse(String s){
        StringBuilder ss= new StringBuilder(s);
        for(int i=0,j=ss.length()-1;i<j;i++,j--){
            char t=s.charAt(i);
            ss.setCharAt(i,ss.charAt(j));
            ss.setCharAt(j,t);
        }
        return ss.toString();
    }

    public static String reverseCharArray(String s){
        char[] arr=s.toCharArray();
        for(int i=0,j=arr.length-1;i<j;i++,j--){
            char temp;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        return new String(arr);
    }


    public static void main(String[] args) {
        String S="Geeks of geeks";
        String Reversed =reverseCharArray(S);
        System.out.println(Reversed);


    }
}
