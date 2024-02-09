package Stack;
//<------ Linked list Implementation of the stack---->
public class LLImplementation {
    public static class Node{ //<--- User defined data type ---->
        int val;
        Node next;
        Node(int data) {
            this.val= data;
        }
    }
    public static class LLStack { // <---User defined data Structure ---->
       private Node head = null;
       private int size = 0;

       // <-----This function is used to push Node in the top of the stack------>
        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        // <------This function is used to pop Node from the top of the stack----->
        int pop() {
            if(head == null) {
                System.out.print("Stack is Empty :  ");
                return -1;
            }
            int data = head.val;
            head = head.next;
            size--;
            return data;
        }


        // <------This function is used to access the top most element of the stack----->
        int peek() {
            if(head == null) {
                System.out.println("Stack is Empty!");
                return -1;
            }
            return head.val;
        }

        //<-----This function is used to display the element of the stack----->
        void displayRecursion(Node h) {
            if(h == null) {
                return;
            }
            displayRecursion(h.next);
            System.out.print(h.val + " ");
        }
        void display() {
            displayRecursion(head);
            System.out.println();
        }

        //<-----This function is used to display the element of the stack in reverse order----->
        void displayReverse() {
            Node temp = head;
            while(temp!= null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();

        }

        // <----This function is used to return the size of the stack----->
        int size() {  // getter
            return size;
        }

        // <----- Check wheather the Stack is Empty or not----->
        boolean isEmpty() {
            if(size == 0) return true;
            return false;

        }



    }
    public static void main(String args[]) {
        LLStack st = new LLStack();
        st.push(1);
        st.display(); // 1
        st.push(2);
        st.display(); // 1 2
        st.push(3);
        st.display(); // 1 2 3
        System.out.println(st.size()); // 3
        st.pop();
        st.display(); // 1 2
        System.out.println(st.size()); // 2
        System.out.println(st.peek()); // 2

    }
}
