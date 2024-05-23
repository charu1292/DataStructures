package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTreversal {

    public static void preOrder(BinaryTreeNode root){
        if(root==null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inorder(BinaryTreeNode root){
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }

    public static void postorder(BinaryTreeNode root){
        if(root==null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");

    }

    public static void BreadthTreeTreversal(BinaryTreeNode root){

        if(root == null)
            return;
        Queue<BinaryTreeNode> q =new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            BinaryTreeNode node = q.poll();
            System.out.print(node.data + " ");
            if(node.left != null)
                q.offer(node.left);
            if(node.right != null)
                q.offer(node.right);
        }
    }




    public static  BinaryTreeNode getBinaryTree(){
        BinaryTreeNode root=new BinaryTreeNode(1);
        root.left= new BinaryTreeNode(2);
        root.right=new BinaryTreeNode(3);
        root.left.left =new BinaryTreeNode(4);
        root.left.right=new BinaryTreeNode(5);
        root.right.left=new BinaryTreeNode(6);
        root.right.right =new BinaryTreeNode(7);

        return root;

    }

    public static void main(String[] args) {
        BinaryTreeNode root=getBinaryTree();
/*        preOrder(root);
        System.out.println(" ");
        inorder(root);
        System.out.println(" ");
        postorder(root);*/
        BreadthTreeTreversal(root);
    }
}


class BinaryTreeNode {
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;

    public BinaryTreeNode(int data) {
        this.data = data;
    }
}