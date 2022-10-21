/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
  let result = {};
  let str = '';
  let len = strs.length;
  for (let i = 0; i < len; i++) {
    str = Array.from(strs[i]).sort().join('');
    if (!result[str]) result[str] = [];
    result[str].push(strs[i]);
  }
  return Object.values(result);
};