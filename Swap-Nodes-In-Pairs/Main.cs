public class Solution {

  private void Swap(ref ListNode head, ref ListNode tail)     {
             (head.val, tail.val) = (tail.val, head.val);
    } 
        
  public ListNode SwapPairs(ListNode head) {
             if (head == null || head.next == null)
             {
                 return head;
             }
             ListNode h = head;
             ListNode fast = head.next;
             ListNode slow = head;
             while (fast != null)
             {
                 Swap(ref fast, ref slow);
                 slow = slow.next;
                 fast = fast.next;
                 if (fast == null)
                 {
                     break;
                 }
                 slow = slow.next;
                 fast = fast.next;
             }

             return h;
         }
}
