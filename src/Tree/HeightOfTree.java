//package Tree;

//
//public class HeightOfTree {
//    public static int heightTree(TreeNode a){
//        if(a ==null){
//            return 0;
//        }
//        int leftheight=heightTree(a.left);
//        int rightheight=heightTree(a.right);
//        int max=Math.max(leftheight,rightheight)+1;
//        return max;
//
//    }
//
//
//    public static void main(String[] args) {
//        TwoTreeMirror tree = new TwoTreeMirror();
//        TreeNode a = new TreeNode(1);
//        a.left = new TreeNode(2);
//        a.right = new TreeNode(3);
//        a.left.left = new TreeNode(4);
//        a.left.right = new TreeNode(5);
//        a.left.left.left=new TreeNode(7);
//        a.left.left.left.left=new TreeNode(9);
//        int c=heightTree(a);
//        System.out.println("Height is " + c);
//
//
//    }
//}
