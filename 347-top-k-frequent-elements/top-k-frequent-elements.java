class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        PriorityQueue<Integer> topk = new PriorityQueue<>((a,b)->map.get(a)-map.get(b));

        for(Integer key:map.keySet()){
            topk.add(key);
            if(topk.size()>k){
                topk.poll();
            }
        }

        int[] ans = new int[k];

        for(int i=0;i<k;i++){
            ans[i]=topk.poll();
        }

        return ans;
    }
}