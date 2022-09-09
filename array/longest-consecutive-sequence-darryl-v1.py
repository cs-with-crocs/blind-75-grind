class Solution:  
    def longestConsecutive(self, nums: List[int]) -> int:
        ranThrough = {}
        highestVal = 0
        currentPointer = 0
        
        if value in hashmap.keys():
            sorted()
        """
        Loop through all items in nums, if there is a consecutive above,
        place into hashmap, and 'point' the hashmap value to the upper one
        """
        for i, v in enumerate(nums):
            up = v + 1
            if up in ranThrough.keys(): # if the upper one exists point to the next key
                ranThrough[v] = up
            else:
                ranThrough[v] = 0
        
        def checkNext(nextValue, currentCounter, highestVal):
            if nextValue >= (len(ranThrough) - 1):
                return highestValue
            if ranThrough[nextValue] != 0:
                currentCounter += 1
                checkNext(v + 1, currentCounter, highestVal)
            else:
                currentPointer += 1
                if currentPointer > highestVal:
                    checkNext(list(my_dict.values())[currentPointer], 0, currentPointer)
                else:
                    checkNext(list(my_dict.values())[currentPointer], 0, highestVal)
                
        checkNext(list(ranThrough.values())[currentPointer], 0, 0)