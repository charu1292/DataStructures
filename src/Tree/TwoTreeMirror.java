package Tree;

public class TwoTreeMirror {

    public static boolean areMirror(TreeNode a, TreeNode b){

        if(a==null&&b==null){
            return true;
        }
        if(a==null||b==null){
            return false;
        }
        if(a.data!=b.data){
            return false;
        }
        return areMirror(a.left,b.right)&&areMirror(a.right,b.left);
    }


    public static void main(String[] args) {
        TwoTreeMirror tree = new TwoTreeMirror();
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(1);
        a.left = new TreeNode(2);
        a.right = new TreeNode(3);
        a.left.left = new TreeNode(4);
        a.left.right = new TreeNode(5);

        b.left = new TreeNode(3);
        b.right = new TreeNode(2);
        b.right.left = new TreeNode(5);
        b.right.right = new TreeNode(4);

        boolean c=areMirror(a,b);
        if(c==true){
            System.out.println("they are mirror of each other");
        }
        else System.out.println("they are not mirror");
    }

}

class TreeNode
{
    int data;
    TreeNode left, right;

    public TreeNode(int data)
    {
        this.data = data;
        left = right = null;
    }
}
