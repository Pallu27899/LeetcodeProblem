/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    count=0;
    for(var i=0;i<nums.length;i++){
        for (var j=i+1;j<nums.length;j++){
        
        if(nums[i]+nums[j]===target){
        return [i,j]

        }
        }
    } 
       
};