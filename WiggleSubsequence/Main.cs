public class Solution {
    public int WiggleMaxLength(int[] nums)
    {
        if (nums.Length == 0) return 0;
        if (nums.Length == 1) return 1;

        int CurrentMax = 1;   
        bool prevSet = false; 
        bool prev = false;

        for (int index = 0; index < nums.Length - 1; index++)
        {
            if (nums[index] == nums[index + 1])
            {
                continue; 
            }

            bool current = nums[index] < nums[index + 1];

            if (!prevSet || current ^ prev)
            {
                CurrentMax++;
                prev = current;
                prevSet = true;
            }
        }

        return CurrentMax;
    }
}
