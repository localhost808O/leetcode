class Solution {
    public int[] countBits(int n) {
        int[] answer = new int[n + 1];
        if (n == 0) {
            answer[0] = 0;
            return answer;
        }
        if (n == 1) {
            answer[0] = 0;
            answer[1] = 1;
            return answer;
        }
        answer[0] = 0;
        answer[1] = 1;
        int pow = 2;
        for (int index = 2; index <= n; index++) {
            if (index > pow*2-1) {
                pow *= 2;
            }
            answer[index] = answer[index-pow] + 1;
        }

        return answer;
    }
}
