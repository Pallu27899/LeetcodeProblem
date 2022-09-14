/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function(nums, target) {
 for (let i = 0; i < nums.length; i++) {
    if (target <= nums[i]) {
      return i;
    }
  }
   return nums.length;
};