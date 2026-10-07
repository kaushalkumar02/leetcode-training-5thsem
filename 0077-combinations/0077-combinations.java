class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combinations = new ArrayList<>();
        answer(1, n, k, new ArrayList<>(), combinations);
        return combinations;
    }
     void answer(int start, int n, int k,
                           List<Integer> current,
                           List<List<Integer>> combinations) {
        if (current.size() == k) {
            combinations.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i <= n; i++) {
            current.add(i);
            answer(i + 1, n, k, current, combinations);
            current.remove(current.size() - 1);
        }
    }
}