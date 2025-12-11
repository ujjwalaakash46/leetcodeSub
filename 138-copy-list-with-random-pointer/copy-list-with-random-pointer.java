/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> mp = new HashMap<>();
        Node d = new Node(0);
        Node h = head;
        while(h!=null){
            mp.put(h, new Node(h.val));
            h=h.next;
        }

        // System.out.print(mp);

        h=head;
        Node dd = d;
        // dd.next=d;

        while(h!=null){
            // System.out.println(h.val);
            d.next = mp.get(h);
            // System.out.println(d.val);
            d.next.next = mp.get(h.next);
            d.next.random = mp.getOrDefault(h.random, null);
            h=h.next;
            d=d.next;
            // System.out.println(d.val);
        }
        // System.out.println(dd.val);
        return dd.next;
    }
}