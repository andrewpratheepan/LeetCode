def twoSum(nums, target:int):
    for i in range(len(nums)):
        for j in range(i+1, len(nums)):
            if (nums[i])+(nums[j]) == target and i!=j:
                return [i,j]

