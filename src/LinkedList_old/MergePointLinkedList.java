package LinkedList_old;

class MergePointLinkedList {
    public static Node mergePoint(Node head1, Node head2) {
        if(head1 == null || head2 == null)
            return null;
        int size1 = getSize(head1);
        int size2 = getSize(head2);
        if(size2 < size1) {
            return mergePoint(head2, head1);
        }
        int diff = size2 - size1;
        while (diff != 0) {
            head2 = head2.next;
            diff--;
        }
        while (head1 != head2) {
            head1 = head1.next;
            head2 = head2.next;
        }
        return head1;
    }

    public static int getSize(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public static void main(String[] args) {


        Node h1 = new Node(1);
        Node h2 = new Node(3);

        h1.next = new Node(4);
        h1.next.next = new Node(5);
        h1.next.next.next = new Node(7);
        h1.next.next.next.next = new Node(10);


        h2.next = new Node(9);
        h2.next.next = h1.next.next.next;

        Node merge = mergePoint(h1, h2);

        if(merge != null) {
            System.out.println(merge.data);
        } else {
            System.out.println("no common point");
        }

    }
}
