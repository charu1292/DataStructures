package LinkedList;

public class LinkedList {


        public static void main(String[] args) {

            LinkedListNode head = getLinkedList();

            printList(head);

//        head = insertAtBegin(head, 5);
//
//        printList(head);
//
//        head = insertAtEnd(head, 10);
//
//        printList(head);
//
//        head=deletionNodeBegining(head);
////        printList(head);
//
//        head=deletionNodeEnd(head);
////        printList(head);
//        head=insertAtBetween(head,10,3);
////        printList(head);
//       head =deleteAtBetween (head,0);
//        printList(head);
            head = reverse(head);
            printList(head);


        }

        public static void printList(LinkedListNode head) {
            if (head == null) {
                System.out.println("LIst is empty");
                return;
            }
            while (head != null) {
                System.out.print(head.data + " ");
                head = head.next;
            }
            System.out.println("");
        }

        public static LinkedListNode insertAtBegin(LinkedListNode head, int data) {
            LinkedListNode newNode = new LinkedListNode(data);
            newNode.next = head;
            return newNode;
        }

        public static LinkedListNode insertAtEnd(LinkedListNode head, int data) {

            if (head == null) {
                return new LinkedListNode(data);
            }
            LinkedListNode itr = head;
            while (itr.next != null) {
                itr = itr.next;
            }
            LinkedListNode newNode = new LinkedListNode(data);
            itr.next = newNode;
            return head;
        }

        public static LinkedListNode deletionNodeBegining(LinkedListNode head) {
            if (head == null) {
                return null;
            }
            LinkedListNode itr = head.next;
            head.next = null;
            head = itr;
            return head;
        }

        public static LinkedListNode deletionNodeEnd(LinkedListNode head) {
            if (head == null || head.next == null) {
                return null;
            }
            LinkedListNode itr = head;
            while (itr.next.next != null) {
                itr = itr.next;
            }
            itr.next = null;
            return head;
        }

        public static LinkedListNode insertAtBetween(LinkedListNode head, int data, int pos) {
            if (head == null) {

                if (pos == 0) {
                    return new LinkedListNode(data);
                } else {
                    throw new RuntimeException("incorrect position");
                }
            }

            if (pos == 0) {
                return insertAtBegin(head, data);
            } else {
                int count = 0;
                LinkedListNode itr = head;
                while (itr != null && count < pos - 2) {
                    itr = itr.next;
                    count++;
                }
                if (itr == null) {
                    throw new RuntimeException("invalid pos");
                }
                LinkedListNode newNode = new LinkedListNode(data);
                newNode.next = itr.next;
                itr.next = newNode;
                return head;
            }
        }

        public static LinkedListNode deleteAtBetween(LinkedListNode head, int pos) {
            if (head == null) {
                System.out.println("Linked list is empty");
                return null;
            }
            if (pos == 0) {
                return deletionNodeBegining(head);
            } else {
                int count = 0;
                LinkedListNode itr = head;
                while (itr != null && count < pos - 1) {
                    itr = itr.next;
                    count++;
                }
                if (itr == null) {
                    throw new RuntimeException("invalid pos");
                }
                LinkedListNode t = itr.next;
                itr.next = t.next;
                t.next = null;
                return head;
            }
        }


        public static LinkedListNode reverse(LinkedListNode head) {
            if(head == null || head.next == null) {
                return head;
            }
            LinkedListNode temp = head;
            LinkedListNode marker = head.next;
            head = head.next;
            temp.next = null;
            LinkedListNode reversed = reverse(head);
            marker.next = temp;
            return reversed;
        }

        public static LinkedListNode getLinkedList() {
            LinkedListNode head = new LinkedListNode(1);
            LinkedListNode second = new LinkedListNode(2);
            head.next = second;
            LinkedListNode third = new LinkedListNode(3);
            second.next = third;
            LinkedListNode fourth = new LinkedListNode(4);
            third.next = fourth;
            return head;
        }

        public static int size(LinkedListNode head) {
            int count = 0;
            while (head != null) {
                count++;
                head = head.next;
            }
            return count;
        }
    }



    class LinkedListNode {
        int data;
        LinkedListNode next;
        LinkedListNode(int data) {
            this.data = data;
        }
    }
