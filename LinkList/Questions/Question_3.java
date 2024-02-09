package LinkList.Questions;
//  QUESTION : Remove the Nth Node from the end of the Linked List (In One Traversal).
// In one traversal ka mtlb ek bar hi hm loop last tak chala sakate hai
public class Question_3 {
    public static Node deleteNthNodeFromEnd(Node head, int n) {
        Node slow = head;
        Node fast = head;
        for(int i=1; i<=n; i++) {
            fast = fast.next;
        }
        if(fast == null) {
            head = head.next;
            return head;
        }
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
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
       Node a = new Node(100);
       Node b = new Node(13);
       Node c = new Node(4);
       Node d = new Node(5);
       Node e = new Node(12);
       Node f = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a);
        int n = 2;
        a = deleteNthNodeFromEnd(a,n);
        display(a);
    }
}
