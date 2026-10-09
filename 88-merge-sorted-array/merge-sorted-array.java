class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int num1Location = m - 1 ;
        int num2Location = n - 1 ;
        int i = nums1.length - 1 ;
        while( num2Location >= 0){
            if( num1Location >= 0 && nums1[num1Location] > nums2[num2Location] ){
                nums1[i] = nums1[num1Location] ;
                num1Location--;
            }
            else{
                nums1[i] = nums2[num2Location] ;
                num2Location--;
            }
            i--;
        } 
    }
}