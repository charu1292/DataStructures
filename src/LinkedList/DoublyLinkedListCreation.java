package LinkedList;

public class DoublyLinkedListCreation {
    public DllNode addToStart(DllNode head, int data) {
        if(head == null)
            return new DllNode(data);
        DllNode node = new DllNode(data);
        node.next = head;
        head.prev = node;
        return node;
    }

    public DllNode addToEnd(DllNode head, int data) {
        if(head == null)
            return new DllNode(data);
        DllNode node = new DllNode(data);
        DllNode itr = head;
        while (itr.next != null)
            itr = itr.next;
        itr.next = node;
        node.prev = itr;
        return head;
    }
    public DllNode getList() {
        DllNode head = new DllNode(1);
        head.next = new DllNode(2);
        head.next.prev = head;
        head.next.next = new DllNode(3);
        head.next.next.prev = head.next;
        return head;
    }
}


class DllNode {
    int data;
    DllNode prev;
    DllNode next;

    public DllNode(int data) {
        this.data = data;
    }
}

