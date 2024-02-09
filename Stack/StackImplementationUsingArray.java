package Stack;

public class StackImplementationUsingArray {
    public static class Stack{
        private int[] arr = new int[5];
        private int idx = 0;

        // <------push function is used to push the element in the stack----->
        void push(int x) {
            if(idx == arr.length) {
                System.out.println("Stack is full!");
                return;
            }
            arr[idx] = x;
            idx++;
        }

        // <------peek function is used to access the top most element of the stack without removing it form the stack---->
        int peek() {
            if(idx == 0) {
                System.out.print("Stack is empty : ");
                return -1;
            }

            return arr[idx-1];

        }

        // <-----pop function is used to pop the element form the top of the stack----->
        int pop() {
            if(idx == 0) {
                System.out.print("UnderFlow  : ");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }
        // <------Display functio is used to display the element of the stack----->
        void display() {
            for(int i=0; i<idx; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        // <-----Size function is to return the size of the stack--->
        int size() {
            return idx;
        }

        // <-----Check wheather the stack is full or not----->
        boolean isFull() {
            if(idx == arr.length) {
                return true;
            }
          return false;
        }

        // <-----Check wheather the stack is empty or not--->
        boolean isEmpty() {
            if(idx == 0) return true;
            return false;
        }

        //<----How much element array can store----->
        int capacity() {
            return arr.length;
        }


    }
    public static void main(String args[]) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.display(); // 1 2 3 4
        st.pop();
        st.display();// 1 2 3
        System.out.println(st.size());
        st.pop();
        st.display(); // 1 2
        System.out.println(st.isFull());

    }
}
