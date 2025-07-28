/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void flatten(TreeNode root) {
        Queue<TreeNode> qu = new ArrayDeque<>();
        if(root==null) return;
        TreeNode r = root, h = root;

        preO(qu, r);
        h.left=null;
        qu.poll();
        while(!qu.isEmpty()){
            h.right=qu.poll();
            h.left=null;
            h=h.right;
        }

    }

    public void preO(Queue<TreeNode> qu , TreeNode r){
        if(r==null){
            return;
        }
        qu.add(r);
        if(r.left!=null) preO(qu, r.left);
        if(r.right!=null) preO(qu, r.right);
    }
}