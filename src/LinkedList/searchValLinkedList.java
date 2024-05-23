package LinkedList;

public class searchValLinkedList {

    public static boolean isPresent( Node head,int val){
        Node temp=head;////traversing through the linked list
        System.out.print("linked list is: ");
        while(temp!=null){
            System.out.print(temp.data + " ");
            if(temp.data==val){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Node head=new Node(2);
        head.next=new Node(4);
        head.next.next=new Node(5);
        head.next.next.next=new Node(6);
        int val=2;
        boolean c= isPresent(head,val);
        System.out.println();
        if (c)
        {
            System.out.println("val is present");
        }
        else
            System.out.println("value is not present");

    }
}
