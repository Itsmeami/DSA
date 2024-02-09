package LinkList.Questions;

public class Question_4 {
    public static Node intersectionOfTwoLinkedList(Node headA, Node headB) {
        Node tempA = headA;
        Node tempB = headB;
        int lengthA = 0;
        while(tempA != null) {
            lengthA++;
            tempA = tempA.next;
        }
        int lengthB = 0;
        while(tempB != null) {
            lengthB++;
            tempB = tempB.next;
        }
        tempA = headA;
        tempB = headB;

        if(lengthA>lengthB) {
            int m = lengthA-lengthB;
            for(int i=1; i<=m; i++) {
                tempA = tempA.next;
            }
        }
        else {
            int m = lengthB-lengthA;
            for(int i=1; i<=m; i++) {
                tempB = tempB.next;
            }
        }
        while(tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;


    }
    public static void display(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static class Node{
        int val;
        Node next;
        Node(int data) {
            this.val = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(87);
        Node b = new Node(100);
        Node c = new Node(13);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(12);
        Node g = new Node(10);
        // link for list 2
        Node a1 = new Node(90);
        Node b1 = new Node(9);
        // Linked list - 1 name as headA
        // 87 -> 100 -> 13 -> 4 -> 5 -> 12 -> 10
       a.next = b;
       b.next = c;
       c.next = d;
       d.next = e;
       e.next = f;
       f.next = g;

        // Linked list -2 name as headB
        // 90 -> 9 -> 5 -> 12 -> 10
        a1.next = b1;
        b1.next = e;
        e.next = f;
        f.next = g;
        display(a);
        display(a1);

        Node q = intersectionOfTwoLinkedList(a,a1);
        System.out.println("The point at which the insertion take place is :  " + q.val);


    }
}
