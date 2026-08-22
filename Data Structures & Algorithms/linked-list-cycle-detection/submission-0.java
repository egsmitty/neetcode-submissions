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
    public boolean hasCycle(ListNode head) {
        Map<ListNode, Integer> nodeMap = new HashMap<>();
        while (head != null) {
            nodeMap.put(head, nodeMap.getOrDefault(head, 0) + 1);
            if (nodeMap.get(head) - 1 != 0) {
                return true;
            }
            head = head.next;
        }

        return false;
    }
}
