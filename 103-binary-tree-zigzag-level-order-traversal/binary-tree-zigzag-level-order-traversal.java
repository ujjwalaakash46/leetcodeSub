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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayDeque<TreeNode> qu = new ArrayDeque<>();
        List<List<Integer>> ans = new LinkedList<>();
        if(root==null) return ans;

        qu.add(root);

        boolean fla=false;
        while(!qu.isEmpty()){
            LinkedList<Integer> row = new LinkedList<>();
            int s = qu.size();
            for(int i=0; i<s; i++){
                if(qu.peek().left!=null) qu.offer(qu.peek().left);
                if(qu.peek().right!=null) qu.offer(qu.peek().right);
                if(fla){
                    row.addFirst(qu.poll().val);
                }else{
                    row.addLast(qu.poll().val);
                }
            }
            fla = !fla;
            ans.add(row);
        }
        return ans;

    }
}