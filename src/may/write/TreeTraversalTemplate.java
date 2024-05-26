package may.write;

import common.TreeNode;

/**
 * <p> 树遍历模板 </p>
 *
 * @author kancsd
 * @description
 * @date 2024/05/26 14:14
 */
public class TreeTraversalTemplate {

    public void preorderTraversal(TreeNode root) {
        if (root == null) return;

        System.out.print(root.val + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    public void inorderTraversal(TreeNode root) {
        if (root == null) return;

        inorderTraversal(root.left);
        System.out.print(root.val + " ");
        inorderTraversal(root.right);
    }

    public void postorderTraversal(TreeNode root) {
        if (root == null) return;

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.val + " ");
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        TreeTraversalTemplate treeTraversal = new TreeTraversalTemplate();

        System.out.println("Preorder traversal:");
        treeTraversal.preorderTraversal(root);
        System.out.println();

        System.out.println("Inorder traversal:");
        treeTraversal.inorderTraversal(root);
        System.out.println();

        System.out.println("Postorder traversal:");
        treeTraversal.postorderTraversal(root);
        System.out.println();
    }
}
