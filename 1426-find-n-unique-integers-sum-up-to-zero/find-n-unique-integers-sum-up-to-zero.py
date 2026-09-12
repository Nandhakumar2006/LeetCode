class Solution:
    def sumZero(self, n: int) -> List[int]:
        
        list1=[]
        if(n%2==0):
            i=1
            while(i<=n//2):
                list1.append(i)
                list1.append(-i)
                i+=1

        elif n%2!=0:
            i=1
            while(i<=n//2):
                list1.append(i)
                list1.append(-i)
                i+=1
            list1.append(0)
        return list1


