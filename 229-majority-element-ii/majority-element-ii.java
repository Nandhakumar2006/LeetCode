class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int candidate1 = 0 , candidate2 = 0 ; 
        int count1 = 0 , count2 = 0 ;

        for(int num : nums ){
            if( count1>0 && candidate1 == num ){
                count1++ ;
            }
            else if( count2>0 && candidate2 == num ){
                count2++ ;
            }
            else if( count1 == 0 ){
                candidate1 = num ;
                count1=1;
            }
            else if( count2 == 0 ){
                candidate2 = num ;
                count2=1;
            }
            else{
                count1-- ;
                count2-- ;
            }
        }

        int major = nums.length/3;
        int fullCount1 = 0 ;
        int fullCount2 = 0 ;
        
        for(int num : nums ){
            if( num == candidate1) fullCount1++ ;
            else if( num == candidate2)  fullCount2++;
        }

        List<Integer> answer = new ArrayList<>();

        if(fullCount1 > major) answer.add(candidate1);
        if(fullCount2 > major) answer.add(candidate2);

        return answer;
    }
}