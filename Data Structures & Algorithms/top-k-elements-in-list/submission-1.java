class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        Map<Integer, Integer> m = new HashMap<>();
        for(int i : nums){
            m.put(i, m.getOrDefault(i, 0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
        for(Map.Entry<Integer, Integer> e: m.entrySet()) {
            heap.offer(e);
            if(heap.size() > k) heap.poll();
        }
        int[] res = new int[k];
        for(int i = k-1; i >=0;i--) {
            res[i] = heap.poll().getKey();
        }
        return res;

    }
}
