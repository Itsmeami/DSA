package DoublyLinkedList;

public class BasicOperation {
    public static class Node{
        int val;
        Node next; // default the value at next is null
        Node prev; // null
        Node(int val) {
            this.val = val;
        }
    }

    //Display the node by the head pointer
    public static void display(Node head) {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Display the node by the tail pointer
    public static void display2(Node tail) {
        Node temp = tail;
        while(temp!=null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();

    }

    // Display the node by the random pointer
    public static void display3(Node random) {
        Node temp = random;
        // move the temp to the head
        while(temp.prev!=null) {
            temp = temp.prev;
        }

        // print the list by temp
        while(temp!=null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    //<------insertion at head------>
    public static Node insertAtHead(Node head, int x) {
        Node a = new Node(x);
        a.next = head;
        head.prev = a;
        head = head.prev;
        return head;

    }

//    <----Insertion at the end---->
    public static void insertionAtEnd(Node head, int x) {
        Node a = new Node(x);
        Node temp = head;
        while(temp.next!=null) {
            temp = temp.next;
        }
        temp.next = a;
        a.prev = temp;
    }

    // <-----Insertion at any given Index ------->
    public static void insertAtAnyIndex(Node head, int idx, int x) {
        Node temp = head;
        for(int i=1; i<idx; i++) {
            temp = temp.next;
        }
        Node tempNext = temp.next;
        Node a = new Node(x);
        temp.next = a;
        a.prev = temp;
        a.next = tempNext;
        tempNext.prev = a;
    }
    public static void main(String[] args) {
        // 4  10  2  99  13
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;

//        display(a);
//        display2(e);
//        display3(c);

       /* <----- Insertio ----->
        Node temp = insertAtHead(a,35);
        display(temp); */   // 35  4  10  2  99  13

        /* <-----Insertion at the end----->
        insertionAtEnd(a,35);
        display(a); */     // 4  10  2  99  13  35


        /* <-----Insertion at any given index  ----->
        insertAtAnyIndex(a, 3, 35);
        display(a); // 4  10  2  35  99  13  */




    }

}
