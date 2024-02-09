package Queue.Implementation;
//<--- Linked list Implementation of Queue----->
// In this we have to maintain the head and tail pointer
// Add the element in tail side
// remove and return the element from the head side

public class LLImplementationOfQueue {


    public static class Node{ // user defined data type
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }


    public static class queueLL{
        Node head = null;
        Node tail = null;
        int size = 0;

        //<----Inserting the element in the Queue---->
        public void add(int x) {
            Node temp = new Node(x);
            if(size == 0) {
                head = tail = temp;
            }
            else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        //<---return the top most element in the queue form front side(head)---->
        public int peek() {
            if(size == 0) {
                System.out.println("Queue is Empty!");
                return -1;
            }
            return head.val;
        }

        //<----Remove the element form the Queue----->
        public int remove() {
            if(size == 0) {
                System.out.println("Queue is Empty!");
                return -1;
            }
            int removeValue = head.val;
            head = head.next;
            size--;
            return removeValue;
        }

        //<---Display the Queue---->
        public void display() {
            if(size == 0) {
                System.out.println("Queue is Empty!");
                return;
            }
            Node temp = head;
            while(temp!=null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        queueLL q = new queueLL();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        System.out.println(q.peek());
        System.out.println(q.remove());
        q.display();




    }
}
