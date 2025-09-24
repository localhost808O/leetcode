public class Solution
{
    public double FindMedianSortedArrays(int[] nums1, int[] nums2)
    {
        int totalLength = nums1.Length + nums2.Length;
        double medianIndex = totalLength / 2.0;
        double result = 0;

        int index1 = 0, index2 = 0;

        for (int count = 0; count <= medianIndex; count++)
        {
            int nextValue;

            if (index1 < nums1.Length && 
                (index2 >= nums2.Length || nums1[index1] < nums2[index2]))
            {
                nextValue = nums1[index1++];
            }
            else
            {
                nextValue = nums2[index2++];
            }

           
            if (count >= medianIndex - 1)
            {
                bool isOdd = (totalLength % 2 == 1);
                int divisor = isOdd ? 1 : 2;
                result += nextValue / (double)divisor;
            }
        }

        return result;
    }
}
