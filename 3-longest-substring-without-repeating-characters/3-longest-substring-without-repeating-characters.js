/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
     const data = new Set();
  let left = 0;
  let right = 0;
  let result = 0;
  while (right < s.length) {
    const currentChar = s.charAt(right);
  
    if (!data.has(currentChar)) {
      data.add(currentChar);
      result = Math.max(result, right - left + 1);
      right++;
    } else {
      data.delete(s.charAt(left));
      left++;
    }
  }

  return result;
};