class Solution {
    public int reverseDegree(String s) {

        int total = 0,i=1;
        for(char s1:s.toCharArray()){
            total+=i*(26-(s1-'a'));
            i++;
        }
        return total;
    }
}