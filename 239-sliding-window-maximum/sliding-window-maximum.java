class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length-k+1];
        Deque<Integer> q = new ArrayDeque<>();
        int left=0,right=0,index=0;

        for(right=0;right<nums.length;right++){
            while(!q.isEmpty() && nums[q.peekLast()]<nums[right]){
                q.removeLast();
            }
            q.addLast(right);
            if(q.peekFirst()<left){
                q.removeFirst();
            }

            if(right-left+1==k){
                ans[index]=nums[q.peekFirst()];
                index++;
                left++;
            }
        }
        return ans;
    }
    
}