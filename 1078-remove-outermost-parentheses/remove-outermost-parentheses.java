class Solution {
    public String removeOuterParentheses(String s) {
        int countLeft = 0 ;
        int countRight = 0 ;

        StringBuilder sb = new StringBuilder(s);

        for(int i = 0 ; i < sb.length() ; i++ ){
            if(sb.charAt(i)=='(') countLeft++ ; 

            else if ( sb.charAt(i)==')') countRight++ ;


            if(countLeft == countRight && i > 0 ){
                sb.deleteCharAt(i-(countLeft+countRight-1));
                i=i-1;
                sb.deleteCharAt(i);
                i=i-1;
                countLeft=0;
                countRight=0;
            }

            
        }
        String ans = sb.toString();
        return  ans ;
    }
}