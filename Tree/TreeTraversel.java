package Tree;

public class TreeTraversel {
    TreeNode root;
    public TreeTraversel() {
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
    }

    void Show() {
        if (root != null) {
            System.out.println(root.val);
            System.out.println(root.left.val);
            System.out.println(root.right.val);
        } else {
            System.out.println("The tree is empty.");
        }
    }
    public static void main(String args[]){
        TreeTraversel tn = new TreeTraversel();
        tn.Show();
    }
}
