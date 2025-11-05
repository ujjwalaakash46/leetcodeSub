/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1 = 0, l2 =0;
        ListNode temp1 = headA;
        ListNode temp2 = headB;

        while(temp1!=null){
            l1++;
            temp1=temp1.next;
        }

        while(temp2!=null){
            l2++;
            temp2=temp2.next;
        }

        temp1 = headA;
        temp2 = headB;
        if(l1>l2){
            while(l1!=l2){
                headA=headA.next;
                l1--;
            }
        }else if(l2>l1){
            while(l1!=l2){
                headB=headB.next;
                l2--;
            }
        }
        
        while(headA!=null && headB!=null){
            if(headA==headB){
               return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
}