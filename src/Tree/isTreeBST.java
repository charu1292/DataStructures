//package Tree;
//
//import
//
//import TreetTreeNode;
//
//public class isTreeBST {
//    static TreeNode prev = null;
//    public static boolean isBst(TreeNode root) {
//        if (root == null) {
//            return true;
//        }
//        boolean left = isBst(root.left);
//        if (left == false) {
//            return false;
//        }
//        if (prev != null && prev.data >root.data) {
//            return false;
//        }
//        prev = root;
//        return isBst(root.right);
//
//    }
//
//
//    public static void main(String[] args) {
//        TreeNode root = new TreeNode(50);
//        root.left = new TreeNode(20);
//        root.left.left = new TreeNode(10);
//        root.left.right = new TreeNode(25);
//        root.right = new TreeNode(60);
//        root.right.left = new TreeNode(55);
//        root.right.right = new TreeNode(70);
//
//        boolean c =isBst(root);
//
//        if(c==true){
//            System.out.println("Given tree is BST");
//        }
//        else {
//            System.out.println("given tree is not bst");
//        }
//
//    }
//
//
//}
