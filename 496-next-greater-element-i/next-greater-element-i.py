class Solution:
    def nextGreaterElement(self, nums1, nums2):
       
       list2=[]

       for i in nums1:

        # print(f"current element:{i}")

        idx=nums2.index(i)
        # print(f"index of current element: {idx}")

        list1=nums2[idx:]
        # print(f"list1: {list1}")

        length=len(list1)
        # print(f"length of list1:{length}")

        j=0
        count=0

        while(j<length):

            if list1[0]<list1[j]:
                # print(f"list1[0]: {list1[0]}") 
                # print(f"final value: {list1[j]}")

                list2.append(list1[j])
                count+=1
                break
            j+=1

        if(count==0):
           list2.append(-1)
        
       return list2

       