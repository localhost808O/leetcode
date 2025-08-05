class Solution {
    private Set<Integer> set;
    private int[][] isConnected;
    private void dfs(int index) {
        set.add(index);
        for (int i = 0; i < isConnected.length; i++) {
            if (isConnected[i][index] == 1 && !set.contains(i)) {
                dfs(i);
            }
        }
    }


    public int findCircleNum(int[][] isConnected) {
        this.isConnected = isConnected;
        int counter = 0;
        this.set = new HashSet<>();
        for (int i = 0; i < isConnected.length; i++) {
            if (!set.contains(i)) {
                dfs(i);
                counter++;
            }
        }
        return counter;
    }
}
