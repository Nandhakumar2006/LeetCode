class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        while(len(stones)>1):
            stones.sort(reverse=True)
            if len(stones)>1:
                if(stones[0]==stones[1]):
                    temp1=stones[0]
                    temp2=stones[1]
                    stones.remove(temp1)
                    stones.remove(temp2)
                else:
                    stones.append(abs(stones[0]-stones[1]))
                    temp1=stones[0]
                    temp2=stones[1]
                    stones.remove(temp1)
                    stones.remove(temp2)
        if(len(stones)==1):
                return stones[0]
        if len(stones)==0:
                return 0