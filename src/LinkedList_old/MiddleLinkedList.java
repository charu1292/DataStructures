package LinkedList_old;

//1.In this we take 2 pointer fast,slow,prev
//2.then we start fast and slow from head and prev from null
//3.then we move fast 2 steps and slow 1 step only until we fast is null and fast.next is not null
class MiddleLInkedList {
    public static int MiddleOfLInkedList(Node head) {
        if (head == null || head.next == null) {
            return head.data;
        }
        Node fast, slow,prev;
        fast = slow = head;
        prev=null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev=slow;
            slow = slow.next;
        }
        if(fast == null) {
            return prev.data;
        }
        return slow.data;
    }

    public static Node getLinkedList() {
        Node head = new Node(1);
        Node second = new Node(2);
        head.next = second;
        Node third = new Node(3);
        second.next = third;
        Node fourth = new Node(4);
        third.next = fourth;
        Node fifth = new Node(5);
        fourth.next = fifth;
        return head;
    }

    public static void main(String[] args) {
        Node head = getLinkedList();
        System.out.println(MiddleOfLInkedList(head));

    }
}