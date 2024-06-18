package LinkedList;

public class ADDLinkedListOperations {
    Node head;

    public ADDLinkedListOperations() {
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

    public  void addLast(String data) {
        Node NewNode=new Node(data);
        if(head==null){
            return ;
        }

        Node LastNode = head;
        while (LastNode.next != null) {
            LastNode =LastNode.next;
        }
        LastNode.next=NewNode;
    }

    public static void main(String[] args) {
        ADDLinkedListOperations list = new ADDLinkedListOperations();
        list.addFirst("list");
        list.addFirst("linked");
        list.addFirst("is");
        list.addFirst("this");

        list.printList(); // Output should be: this is linked list





        list.addLast("please");
        list.printList();
    }
}
