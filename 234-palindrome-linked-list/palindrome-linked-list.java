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
        ListNode mid=middleLL(head);
        ListNode reverse=reverseLL(mid);
        ListNode headsec=reverse;
        while(head!=null&&headsec!=null){
            if(head.val!=headsec.val)break;
            head=head.next;
            headsec=headsec.next;
        }
        reverseLL(headsec);
        return head==null||headsec==null;

        
    }
    public ListNode reverseLL(ListNode head){
        if(head==null)return head;
        ListNode prev=null;
        ListNode pres=head;
        ListNode next=head.next;
        while(pres!=null){
            pres.next=prev;
            prev=pres;
            pres=next;
            if(next!=null)next=next.next;

        }
        return prev;
    }
    public ListNode middleLL(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
        }
        return slow;
    }
}