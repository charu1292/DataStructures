package String;

public class RemoveSubstring {
    public static String removeString(String s,String remove){
        String[] words=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length;){
            if (words[i].equals(remove)){
                i++;
            }
            else {
                sb.append(words[i]);
                sb.append(" ");
                i++;
            }
        }
        return sb.toString();
    }
 ///method to remove a substring
    public static String removeStringUsingSubString(String s,String remove){
        int i =0;
        int j=0;
        StringBuilder sb=new StringBuilder();
        while(i<s.length()){
            while(j<s.length() && s.charAt(j)!= ' '){
                j++;
            }
            String word=s.substring(i,j);
            if(!remove.equals(word)){
                sb.append(word);
            }
            if(j==s.length()){
                break;
            }
            else{                         //this commented code is applicable if we want to preserve spaces
//                int spaceCnt=1;
                while(j<s.length()&&s.charAt(j)==' '){
                    j++;
//                    spaceCnt++;
                }
//                while (spaceCnt>0){
//                    sb.append(" ");
//                    spaceCnt--;
//                }
                i=j;
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String S="I don't no who adobe belove      love christmas love you";
        String remove="love";
        System.out.println(removeStringUsingSubString(S,remove));
    }
}
