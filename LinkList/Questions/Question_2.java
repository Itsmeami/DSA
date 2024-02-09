package LinkList.Questions;

//  Finding Nth node from the end of Linked List ---->
public class Question_2 {

    // isame do traversal lage hai pure pure
    public static Node nthNodeFromLast(Node head, int n) {
        Node temp = head;
        int size = 0;
        while(temp != null) {
            size++;
            temp = temp.next;
        }
        int m = size - n + 1;
        // Now we have to find mth Node form start
        temp = head;
        for(int i=1; i<m; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // Iss function ki help se hm ek traversal  me hm kar sakate hai
    public static Node nthNodeFormLast2(Node head, int n) {
        Node fast = head;
        Node slow = head;
        for(int i=1; i<=n; i++) {
            fast = fast.next;
        }
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;

        }
        return slow;
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
        Node e = new Node(10);
        Node f = new Node(12);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // 100 -> 13 -> 4 -> 5 -> 10 -> 12
        int n = 3;
//        Node q = nthNodeFromLast(a,n);
        Node q = nthNodeFormLast2(a,n);
        System.out.println("The " + n + "th Node form the last is : " + q.val);

    }
}
