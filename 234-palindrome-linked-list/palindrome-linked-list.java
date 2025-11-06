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
    public boolean isPalindrome(ListNode head) {
        ListNode f = head;
        ListNode s = head;

        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }

        ListNode rev = rev(s);
        s = head;

        while(rev!=null){
            if(s.val!=rev.val) return false;
            rev=rev.next;
            s=s.next;
        }

        return true;
    }

    public ListNode rev(ListNode h){
        ListNode c = h;
        ListNode p = null;

        while(c!=null){
            ListNode n = c.next;
            c.next=p;
            p=c;
            c=n;
        }

        return p;
    }
}