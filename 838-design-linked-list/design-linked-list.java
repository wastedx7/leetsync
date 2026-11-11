class MyLinkedList {

    public class Node{
        Node next;
        int val;

        Node(int val){
            this.val = val;
        }
    }

    private final Node head;
    private int size;

    public MyLinkedList() {
        head = new Node(0);
        size = 0;
    }
    
    public int get(int index) {
        if(index >= size || index < 0){
            return -1;
        }
        Node curr = head;
        for(int i=0; i<=index; i++){
            curr = curr.next;
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index > size) return;
        if(index < 0) index = 0;

        Node temp = head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        Node toAdd = new Node(val);
        toAdd.next = temp.next;
        temp.next = toAdd;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) return;
        Node temp = head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */