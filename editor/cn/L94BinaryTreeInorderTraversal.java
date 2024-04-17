package cn;

import java.util.ArrayList;
import java.util.List;

/* 二叉树的中序遍历 */
public class L94BinaryTreeInorderTraversal {

    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<>();

            getNode(root, list);

            return list;
        }

        public void getNode(TreeNode treeNode, List<Integer> list) {
            if (treeNode == null) {
                return;
            }

            if (treeNode.left != null) {
                getNode(treeNode.left, list);
            }

            list.add(treeNode.val);

            if (treeNode.right != null) {
                getNode(treeNode.right, list);
            }
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


    public static void main(String[] args) {

    }
}
