/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {boolean}
 */
var isValidBST = function(root) {
  var prev = null;
  var now = root;
  var stack = [];

  while (now || stack.length) {
    while (now) {
      stack.push(now);
      now = now.left;
    }

    now = stack.pop();

    if (prev && prev.val >= now.val)
        return false;

    prev = now;
    now = now.right;
  }

  return true; 
};