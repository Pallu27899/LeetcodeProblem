/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var middleNode = function(head) {
     let l = head;
    let r = head;
    
    while(r) {
        if (!r.next){
             break;
        }
        r = r.next.next;
        l = l.next;
    }
    
    return l;
};