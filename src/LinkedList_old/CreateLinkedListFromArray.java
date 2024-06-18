package LinkedList_old;

public class CreateLinkedListFromArray {


    public static Node createLinkedList(int[] A){
        Node head=new Node(A[0]);
        Node mover=head;
        for(int i=1;i<A.length;i++){
            Node temp=new Node(A[i]);
            mover.next=temp;
            mover=temp;
        }
       return head;
    }


    public static void main(String[] args) {
        int[] A={222,4,5,6};
        Node head=createLinkedList(A);
        System.out.println("Head of linked list " + head.data);

        Node temp=head;////traversing through the linked list
        System.out.print("linked list is: ");
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }



    }
}
