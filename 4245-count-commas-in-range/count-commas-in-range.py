class Solution:
    def countCommas(self, n: int) -> int:
        s=str(n)
        if len(s)<=3:
            return 0
        elif len(s)==4:
            return n-999
        elif len(s)==5:
            return (n-9999)+9000
        elif len(s)==6:
            return 99001