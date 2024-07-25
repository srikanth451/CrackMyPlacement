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
        ListNode temp = head;
        int ans = 0;

        while(temp != null)
        {
            if(temp.val == 0)
            {
                ans = ans << 1;

            }
            else{
                ans = ans << 1;
                ans |= 1;
            }
            temp = temp.next;
        }
        return ans;
    }
}