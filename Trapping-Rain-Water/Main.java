public class Solution {
    public int trap(int[] height) {
        int l = 0, r = height.length - 1;
        int lmax = 0, rmax = 0;
        int answer = 0;
        
        while (l < r) {
            if (height[l] <= height[r]) {
                if (lmax <= height[l]) {
                    lmax = height[l];
                } else {
                    answer += (lmax - height[l]);
                }
                l++;
            } else {
                if (rmax <= height[r]) {
                    rmax = height[r];
                } else {
                    answer += (rmax - height[r]);
                }
                r--;
            }
        }
        return answer;
    }
}
