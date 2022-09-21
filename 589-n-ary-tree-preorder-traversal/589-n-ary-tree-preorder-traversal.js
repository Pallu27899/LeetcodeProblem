/**
 * // Definition for a Node.
 * function Node(val, children) {
 *    this.val = val;
 *    this.children = children;
 * };
 */

/**
 * @param {Node|null} root
 * @return {number[]}
 */
var preorder = function(root) {
    const result = []

      const traverse = node => {
        if (!node) return

        result.push(node.val)
        node.children.forEach(traverse)
      }

      traverse(root)

      return result
};