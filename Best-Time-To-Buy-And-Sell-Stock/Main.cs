public class Solution 
{
    public int MaxProfit(int[] prices)
    {
        int mx = 0;
        int min = 100000000;

        for (int i = 0; i < prices.Length; i++)
        {
            min = Math.Min(min, prices[i]);
            mx = Math.Max(mx, prices[i] - min);
        }
        return mx;
    }
}
