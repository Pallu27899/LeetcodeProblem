/**
 * @param {string} s
 * @return {number}
 */
var longestPalindrome = function(s) {
      const counts = {};
      let sum = 0;
      let li = false;

      for (let i = 0; i < s.length; i++) {
        counts[s[i]] = (counts[s[i]] || 0) + 1;
      }

      for (let letter in counts) {
        if (counts[letter] % 2 === 0) {
          sum += counts[letter];
        } else {
          li = true;
          sum += counts[letter] - 1;
        }
      }

      if (li) sum += 1;
      return sum; 
};