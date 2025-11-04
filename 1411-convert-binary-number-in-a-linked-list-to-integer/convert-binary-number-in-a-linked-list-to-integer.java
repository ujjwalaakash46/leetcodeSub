/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        String s="";
        while(head!=null){
            s+=head.val;
            head=head.next;
        }
        char[] st = s.toCharArray();
        int res = 0;
        int j=0;
        for(int i=st.length-1; i>=0; i--){
            int bi = st[i]=='1'?1:0;
            res += (Math.pow(2,j++) )* bi;

        }
        return res;
    }
}