/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var detectCycle = function(head) {
      let l = head;
    let d = head;
    while(d && d.next && d.next.next){
        l = l.next;
        d = d.next.next;
        if(l === d){   
            l = head;
            while(l !== d){
                l = l.next;
                d = d.next;
            }
            return l;
        }
    }
    return null;
};