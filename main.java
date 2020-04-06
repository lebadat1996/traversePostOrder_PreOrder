package Tree.Postorder_Preorder;

public class main {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(20);
        int[] nums = {15, 200, 25, -5, 0, 100, 20, 12, 126, 1000, -150};
        for (int i : nums) {
            tree.addNode(i);
        }

        System.out.print("TraversePreOrder: ");
        tree.traversePreOrder();
        System.out.print("\nTraverseInOrder: ");
        tree.traverseInOrder();
        System.out.print("\nTraversePostOrder: ");
        tree.traversePostOrder();
    }
}
