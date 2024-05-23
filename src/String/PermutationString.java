package String;

public class PermutationString {
    /**
     * permutation function
     * @param s string to calculate permutation for
     * @param l starting index
     */
    public static void permuate(String s) {
        permuateHelper(s.toCharArray(), 0);
    }
    public static void permuateHelper(char[] arr, int index) {
        if (index == arr.length) {
            System.out.println(new String(arr));
            return;
        } else {
            for (int i=index;i<arr.length;i++){
                swap(arr,index,i);
                permuateHelper(arr, index + 1);
                swap(arr,index,i);
            }
        }
    }
    private static void swap(char[] arr,int i,int j) {
        char temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

//    class HelloWorld {
//        public static List<String> permuate(String s) {
//            List<String> result = new ArrayList<>();
//            permuateHelper(s.toCharArray(), 0, result);
//            return result;
//        }
//        public static void permuateHelper(char[] arr, int index, List<String> result) {
//            if (index == arr.length) {
//                result.add(new String(arr));
//                return;
//            } else {
//                for (int i=index;i<arr.length;i++){
//                    swap(arr,index,i);
//                    permuateHelper(arr, index + 1, result);
//                    swap(arr,index,i);
//                }
//            }
//        }
//        private static void swap(char[] arr,int i,int j) {
//            char temp;
//            temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }
//
//
//        public static void main(String[] args) {
//            String s="abcd";
//            List<String> result = permuate(s);
//            // print list
//        }
//    }
    public static void main(String[] args) {
        String s="abcd";
        permuate(s);
    }
}
