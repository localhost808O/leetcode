class Solution {
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for (int i = 2; i <= n; i++) {
            list.add(list.get(i - 1) + list.get(i - 2));
        }
        return list.get(list.size() - 1);
    }
}
