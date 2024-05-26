package may;

import common.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * <p> 题号102：二叉树层序遍历 </p>
 *
 * @author kancsd
 * @description
 * @date 2024/05/26 15:25
 */
public class Code102_TreeSequenceTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if(root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            List<Integer> list = new LinkedList<>();
            int size = q.size();
            for(int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                list.add(curr.val);
                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
            }
            res.add(list);
        }
        return res;
    }
}
