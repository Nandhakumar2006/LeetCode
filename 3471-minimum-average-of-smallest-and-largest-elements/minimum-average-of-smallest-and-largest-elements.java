class Solution {
    public double minimumAverage(int[] nums) {
        List<Integer> al = new ArrayList<>();
        double minn = Integer.MAX_VALUE;
        for(int num : nums) al.add(num);
        
        Collections.sort(al);
        
        while(al.size()>0){
            double avg = (al.get(0)+al.get(al.size()-1))/2.0;
            al.remove(0);
            al.remove(al.size()-1);
            minn = Math.min(minn,avg);
        }

        return minn;
    }
}