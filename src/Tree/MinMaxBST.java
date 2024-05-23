package Tree;

public class MinMaxBST {
    public static int min(TreeNode root){
        if (root==null){
            return -1;
        }
        while(root.left!=null){
            root= root.left;
        }
        return root.data;
    }
    public static int Max(TreeNode root){
        if (root==null){
            return -1;
        }
        while(root.right!=null){
            root= root.right;
        }
        return root.data;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.left.left=new TreeNode(1);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(18);
        root.right.right.right = new TreeNode(23);


        System.out.println(min(root) + " : Minimum number");
        System.out.println(Max(root) + " : Maximum Number");




    }
}
