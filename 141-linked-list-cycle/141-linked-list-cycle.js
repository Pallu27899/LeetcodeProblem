/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} head
 * @return {boolean}
 */
var hasCycle = function(head) {
 var l = head;
  var r = head;
  while (l && r) {
    l = l.next;
    r = r.next ? r.next.next : undefined;
    if (l === r) return true;
  }
  return false;
};