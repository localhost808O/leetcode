public class Solution {
    public int FindDuplicate(int[] nums)
    {
        int fast = 0;
        int slow = 0;
        int s = 0;
        while (true)
        {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if (slow == fast)
            {
                break;
            }
        }

        while (true)
        {
            slow = nums[slow];
            s = nums[s];
            if (s == slow)
            {
                return slow;
            }
        }

    }
}
