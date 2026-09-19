class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double total=0;
        for(int i=0;i<k;i++){
            total+=nums[i];
        }
        double maxAvg = (double)(total/k);

        for(int i=k;i<nums.length;i++){
            total-=nums[i-k];
            total+=nums[i];

            double avg = (double)(total/k);

            maxAvg = Math.max(maxAvg,avg);
        }

        return maxAvg;

    }
}
