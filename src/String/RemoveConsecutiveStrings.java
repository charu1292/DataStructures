package String;

public class RemoveConsecutiveStrings {
    public static String deleteConsecutiveStrings(String s){
        int j=0;
        int i=1;
        char[] arr=s.toCharArray();
        while(i<arr.length){
            if(arr[j]!=arr[i]){
                arr[++j]=arr[i++];
            }
            else
                i++;

        }
        StringBuilder sb=new StringBuilder(); //iterate array from 0 to j
        for(int k=0;k<=j;k++){
            sb.append(arr[k]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "geeks for geeks is best";
        // Printing result
        System.out.println("Output : "
                + deleteConsecutiveStrings(s));

    }
}
