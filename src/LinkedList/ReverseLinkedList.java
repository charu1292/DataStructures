package LinkedList;


public class ReverseLinkedList {
    Node head;

    public ReverseLinkedList() {
        this.head = null;
    }


    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public  void reverselist(){
        if(head==null||head.next==null){
            return ;
        }

        Node prevNode=head;
        Node currentNode=head.next;
        while(currentNode!=null){
            Node nextNode=currentNode.next;
            currentNode.next=prevNode;
            prevNode=currentNode;
            currentNode=nextNode;
        }

        head.next=null;
        head=prevNode;

    }


    public Node reverseListRecursive(Node head) {
        //empty node || last node or only one node
        if(head == null || head.next == null) {
            return head;
        }


        Node newHead = reverseListRecursive(head.next);

        head.next.next = head;
        head.next = null;
        return newHead;
    }



    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.addFirst("list");
        list.addFirst("linked");
        list.addFirst("is");
        list.addFirst("this");

        list.printList(); // Output should be: this is linked list

        list.reverselist();
        list.printList();

    }
}
