class Solution {
    public long countCompleteDayPairs(int[] hours) {
        long count = 0;
        int[] arrays = new int[24];
        for (int hour : hours) {
            arrays[hour%24]++;
        }
        for (int index = 1; index <= 11; index++) {
            if (index == 12 && arrays[index] == 1) {
                continue;
            }
            if (arrays[index] > 0 && (arrays[index] > 0 &&  arrays[24-index] > 0)) {
            
                long maxV = (long) arrays[index] * arrays[24-index];
                count += maxV;
            }
        }

        if (arrays[12] > 1) {
            count += (long) arrays[12] * (arrays[12]-1) / 2;
        }
        if (arrays[0] > 1) {
            count += (long)arrays[0] * (arrays[0]-1) / 2;
        }
        return count;
    }
}
