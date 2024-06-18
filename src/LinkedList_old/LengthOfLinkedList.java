package LinkedList_old;

public class LengthOfLinkedList {

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

    public static int LengthLinkedList(Node head){
        int cnt=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] A={2,3,4,45};
        Node head=createLinkedList(A);
        int length=LengthLinkedList(head);
        System.out.println(length);

    }
}
