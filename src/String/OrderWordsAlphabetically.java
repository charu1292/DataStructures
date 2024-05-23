package String;

public class    OrderWordsAlphabetically {

        public static String reverseWord(String s){
            String[] words = s.split(" ");
            // Implement bubble sort algorithm to sort words alphabetically
            for (int i = 0; i < words.length - 1; i++) {
                for (int j = 0; j < words.length - i - 1; j++) {
                    if (words[j].compareTo(words[j + 1]) > 0) {
                        // Swap the words
                        String temp = words[j];
                        words[j] = words[j + 1];
                        words[j + 1] = temp;
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            for(String word : words) {
                sb.append(word).append(" ");
            }
            return sb.toString().trim(); // Trim any trailing space
        }

        public static void main(String[] args) {
            String s1 = "I love Adobe  All Express";
            String reversed = reverseWord(s1);
            System.out.println(reversed);
        }
    }

