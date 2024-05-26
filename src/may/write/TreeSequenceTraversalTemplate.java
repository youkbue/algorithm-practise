package may.write;

import common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <p> 二叉树层序遍历模板 </p>
 *
 * @author kancsd
 * @description
 * @date 2024/05/26 15:33
 */
public class TreeSequenceTraversalTemplate {

    public void traverse(TreeNode root){
        if( root == null ) return;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);

        while (!q.isEmpty()){
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
            }
        }
    }
}
