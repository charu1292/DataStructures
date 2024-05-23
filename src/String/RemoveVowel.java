package String;

public class RemoveVowel {

    static String removal(String s) {
        char[] arr=s.toCharArray();
        int i=0;
        int j=-1;
        while(i<arr.length){
            if(!isVowel(arr[i])){ //agr i pe vowel ni hai to usko j me dalo aur i ko bda do
                arr[++j]=arr[i++];
            }
            else i++; //increment i without storing in j if letter is vowel
        }
        StringBuilder sb=new StringBuilder(); //itrtate array from 0 to j
        for(int k=0;k<=j;k++){
            sb.append(arr[k]);
        }
        return sb.toString();

    }

    static boolean isVowel(char c) {
        if (c == 'a' || c == 'e'
                || c == 'i' || c == 'o'
                || c == 'u' || c == 'A'
                || c == 'E' || c == 'I'
                || c == 'O'
                || c == 'U'){
            return true;
    }
    return false;
}

    static String remVowel(String str)
    {

        return str.replaceAll("[aeiouAEIOU]", "");
    }

    // Driver Code
    public static void main(String[] args)
    {
        String str = "GeeeksforGeeks - A Computer Science Portal for Geeks";
//        System.out.println(remVowel(str));
//
//        System.out.println();
        String afterRemoval=removal(str);
        System.out.println(afterRemoval);
    }
}
