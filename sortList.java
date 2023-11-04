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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ArrayList<Integer>res = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            res.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(res);
        temp = head;
        while(temp!=null){
            temp.val = res.remove(0);
            temp = temp.next;
        }
        return head;
    }
}
//LEETCODE
