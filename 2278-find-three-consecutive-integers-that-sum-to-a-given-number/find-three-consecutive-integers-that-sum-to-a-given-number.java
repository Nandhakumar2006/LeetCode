class Solution {
    public long[] sumOfThree(long num) {

        long[] ans =new long[3];

        if(num%3!=0) return new long[]{};

        else{
            long middle = num/3;
            ans[1]=middle;
            long first = middle-1;
            ans[0]=first;
            long last = middle+1;
            ans[2]=last;
        }

        return ans;
    }
}