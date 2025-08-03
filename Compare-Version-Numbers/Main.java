class Solution {

    public int compareVersion(String version1, String version2) {
        String[] arr1 =  version1.split("\\.");
        String[] arr2 = version2.split("\\.");
        int maxLength = Math.max(arr1.length, arr2.length);
        // int p1 = 0, p2 = 0;
        for (int i = 0; i < maxLength; i++) {
            int p1 = 0, p2 = 0;
            if (i < arr1.length) {
                p1 = Integer.parseInt(arr1[i]);
            }
            if (i < arr2.length) {
                p2 = Integer.parseInt(arr2[i]);
            }
            if (p1 > p2) {
                return 1;
            } else if (p1 < p2) {
                return -1;
            }
        }
        return 0;
    }
}
