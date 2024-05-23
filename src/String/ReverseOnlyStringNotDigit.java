package String;

public class ReverseOnlyStringNotDigit {
    public static String reverseCharactersOnly(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;
        while (i < j) {
            while (i < j && !Character.isLetter(chars[i])) { //check A[i] is digit or not
                i++;
            }
            while (i < j && !Character.isLetter(chars[j])) { //check A[j] is digit or not
                j--;
            }

            if (i < j) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
        }
        return new String(chars);
}

    public static void main(String[] args) {
        String s = "abcd66ty78jkum98yolo";
        String reversed = reverseCharactersOnly(s);
        System.out.println(reversed); // Output: "dcbd66yt78mukj98oloy"
    }
}
