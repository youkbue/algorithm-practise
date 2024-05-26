package may;

import common.TreeNode;

/**
 * <p> 题号226：翻转二叉树 </p>
 *
 * @author kancsd
 * @description
 * @date 2024/05/26 15:00
 */
public class Code226_FlipTree {

    public TreeNode invertTree(TreeNode root) {
        traversal(root);
        return root;
    }

    private void traversal(TreeNode treeNode){
        if(treeNode == null) return;;

        TreeNode temp = treeNode.left;
        treeNode.left = treeNode.right;
        treeNode.right = temp;

        traversal(treeNode.left);
        traversal(treeNode.right);
    }

}
