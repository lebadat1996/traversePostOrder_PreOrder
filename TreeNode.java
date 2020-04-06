package Tree.Postorder_Preorder;

public class TreeNode {

    private int data;

    private TreeNode left;

    private TreeNode right;


    public TreeNode(int num) {
        this.data = num;
        this.left = null;
        this.right = null;
    }

    public void addNode(int num) {
        if (num < this.data) {
                if (this.left != null) {
                    this.left.addNode(num);
                } else {
                    this.left = new TreeNode(num);
                }
        } else {

            if (this.right != null) {
                this.right.addNode(num);
            } else {
                this.right = new TreeNode(num);

            }
        }
    }

    // Visit the node first, then left and right sub-trees
    public void traversePreOrder() {
        System.out.print(this.data+" ");
        if (this.left != null) {
            this.left.traversePreOrder();
        }
        if (this.right != null) {
            this.right.traversePreOrder();
        }
    }

    // Visit left sub-tree, then node and then, right sub-tree
    public void traverseInOrder() {
        if (this.left != null) {
            this.left.traverseInOrder();
        }
        System.out.print(this.data+ " ");
        if (this.right != null) {
            this.right.traverseInOrder();
        }
    }

    // Visit left sub-tree, then right sub-tree and then the node
    public void traversePostOrder() {
        if (this.left != null) {
            this.left.traversePostOrder();
        }
        if (this.right != null) {
            this.right.traversePostOrder();
        }
        System.out.print(this.data+ " ");
    }
}