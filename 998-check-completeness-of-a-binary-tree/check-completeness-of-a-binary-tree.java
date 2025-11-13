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
    public boolean isCompleteTree(TreeNode root) {
        
        Deque<TreeNode> q1 = new ArrayDeque<>();
        Deque<TreeNode> q2 = new ArrayDeque<>();

        q2.offer(root);
        boolean nf=false;
        boolean lr=false;

        //if null in same, next node should be null and next row zero.
        //if null, next-q2 should be zero. 
        while(!q2.isEmpty() || !q1.isEmpty()){
            // System.out.println("l1");
            while(!q1.isEmpty()){
                // System.out.println("l2");
                TreeNode r = q1.poll();
                // if(r!=null)System.out.println(r.val);
                if(r.left==null){
                    nf=true;
                }else{
                    if(nf==true) return false;
                    q2.offer(r.left);
                }

                if(r.right==null){
                    nf=true;
                }else{
                    if(nf==true) return false;
                    q2.offer(r.right);
                }
            }

            if(lr && !q2.isEmpty()){
                return false;
            }
            if(nf){
                lr=true;
            }


            q1 = new ArrayDeque<>(q2);
            q2.clear();
        }

        return true;

    }
}