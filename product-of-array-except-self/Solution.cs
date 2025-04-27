public class Solution {
    public int[] ProductExceptSelf(int[] nums) {
        int[] ans = new int[nums.Length];
        int multAllAns = 1;
        int isNull = 0;
        foreach (int index in nums)
        {
            if (index == 0)
            {
                isNull++;
                continue;
            }
            multAllAns *= index;
        }

        for (int i = 0; i < ans.Length; i++)
        {
            if (isNull == 1)
            {
                if (nums[i] == 0 && isNull == 1)
                {
                    ans[i] = multAllAns;
                }else {
                    ans[i] = 0;
                    continue;
                }
                
            }

            if (isNull > 1)
            {
                ans[i] = 0;
                continue;
            }
            
            if (nums[i] == 0)
            {
                ans[i] = multAllAns;
                continue;
            }
            ans[i] = multAllAns / nums[i];
        }
        return ans;
    }
}
