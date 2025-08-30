public class Solution
{
    private IList<IList<int>> solution;

    public void F(int[] p, IList<int> temp, int start)
    {
        solution.Add(new List<int>(temp));
        for (int i = start; i < p.Length; i++)
        {
            temp.Add(p[i]);
            F(p, temp, i + 1);
            temp.RemoveAt(temp.Count - 1);
        }
    }
    
    public IList<IList<int>> Subsets(int[] nums) {
        solution = new List<IList<int>>();
        F(nums, [], 0);
        return solution;
    }
}
