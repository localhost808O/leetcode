public class Solution 
{
    public int MaxProfit(int[] prices)
    {
        int sum = 0;

        for (int i = 0; i < prices.Length-1; i++)
        {
            int price = prices[i+1] - prices[i];
            if (price >= 0)
            {
                sum += price;
            }
        }
        return sum;
    }
}
