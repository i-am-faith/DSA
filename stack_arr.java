public class Solution{
    static class Stack {
        int capacity;
        int top;
        int[] arr;
        Stack(int capacity) {
            // Write your code here.
            this.capacity = capacity;
            this.top = -1;
            this.arr = new int[capacity];
        }
        public void push(int num) {
            // Write your code here.
            if(isFull()==1)
            {
                return;
            }
            top++;
            arr[top] = num;
        }
        public int pop() {
            // Write your code here.
            if(isEmpty()==1)
            {
                return -1;
            }
            int val = arr[top];
            top--;
            return val;
        }
        public int top() {
            // Write your code here.
            if(isEmpty()==1)
            {
                return -1;
            }
            return arr[top];
        }
        public int isEmpty() {
            // Write your code here.
            if(top == -1)
            {
                return 1;
            }
            return 0;
        }
        public int isFull() {
            // Write your code here.
            if(top == capacity-1)
            {
                return 1;
            }
            return 0;
        }
    }
}