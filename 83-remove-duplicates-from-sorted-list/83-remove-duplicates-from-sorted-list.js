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
var deleteDuplicates = function(head) {
    if(!head || !head.next) return head;
    var current =head;
    var fast;
    while(current){
        fast=current;
        while(fast && current.val==fast.val ){
              fast=fast.next;
        }
        current.next=fast;
        current=fast;
        
    }
    return head;
};