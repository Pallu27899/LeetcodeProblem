public class MyHashMap {

    ListNode[] nodes;

    public MyHashMap() {
        nodes = new ListNode[10000];
    }

    public void put(int key, int value) {
        int index = getIndex(key);
        ListNode prev = findElement(index, key);
        if (prev.next == null)
            prev.next = new ListNode(key, value);
        else
            prev.next.value = value;
    }

    public int get(int key) {
        int index = getIndex(key);
        ListNode prev = findElement(index, key);
        if (prev.next == null)
            return -1;
        else
            return prev.next.value;

    }

    public void remove(int key) {
        int index = getIndex(key);
        ListNode prev = findElement(index, key);
        if (prev.next != null)
            prev.next = prev.next.next;
    }

    public int getIndex(int key) {
        return Integer.hashCode(key) % nodes.length;
    }

    public ListNode findElement(int index, int key) {
        if (nodes[index] == null)
            return nodes[index] = new ListNode(-1, -1);
        ListNode prev = nodes[index];
        while (prev.next != null && prev.next.key != key) {
            prev = prev.next;
        }
        return prev;
    }

    static class ListNode {
        int key, value;
        ListNode next;

        ListNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */