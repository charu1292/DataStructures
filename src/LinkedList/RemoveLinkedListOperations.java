package LinkedList;

public class RemoveLinkedListOperations {

        Node head;

        public RemoveLinkedListOperations() {
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

    public void removeFirst() {
        if(head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }

        head = this.head.next;
    }

    public void removelast() {

        if(head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }
        if(head.next == null) {
            head=null;
            return;
        }

        Node currentNode=head; // take two pointers
        Node LastNode=head.next;
        while(LastNode.next !=null) {       //iterate until we got last node ka next is null
            currentNode = currentNode.next;
            LastNode = LastNode.next;
        }
        currentNode.next=null;

    }
        public static void main(String[] args) {
            RemoveLinkedListOperations list = new RemoveLinkedListOperations();
            list.addFirst("list");
            list.addFirst("linked");
            list.addFirst("is");
            list.addFirst("this");

            list.printList(); // Output should be: this is linked list

            list.addLast("please");
            list.printList();


            list.removeFirst();
            list.printList();


            list.removelast();
            list.printList();

        }
    }


