/*Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
Example:
Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode l3 = dummy;
        
        if(l1==null && l2==null)
            return null;
        else if (l1==null)
            return l2;
        else if(l2==null)
            return l1;
        
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                l3.next =l1;
                l1=l1.next;
            }
            else {
                l3.next=l2;
                l2=l2.next;
            }
            l3=l3.next;
        }
        if(l1!=null)
            l3.next=l1;
        else
            l3.next=l2;
        
        return dummy.next;
    }
}