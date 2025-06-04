class Solution {
    public List<Integer> findLonely(int[] nums) {
        Set<Integer> visited = new HashSet<>(), set = new HashSet<>();
        for (int i : nums) {
            if (visited.contains(i - 1) || visited.contains(i) || visited.contains(i + 1)) {
                set.remove(i - 1);
                set.remove(i);
                set.remove(i + 1);
            } else
                set.add(i);
            visited.add(i);
        }
        return new ArrayList<Integer>(set);
    }
}
