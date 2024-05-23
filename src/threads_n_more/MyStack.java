
//
//class MyStack {
//
//    int[] arr;
//    int top;
//    int capacity;
//
//    MyStack(int capacity) {
//        this.capacity = capacity;
//        arr = new int[capacity];
//        top = -1;
//    }
//
//
//    boolean isEmpty() {
//        return this.top == -1;
//    }
//
//    boolean isFull() {
//        return this.top == (this.capacity - 1);
//    }
//
//    public void push(int x) {
//        if (this.isFull()) {
//            System.out.println("stack is full cant insert");
//        } else {
//            this.top++;
//            this.arr[top] = x;
//        }
//    }
//
//    public int peek() {
//        if (top == -1) {
//            System.out.println("stack is empty");
//            return -1;
//        } else {
//            return arr[top];
//        }
//    }
//
//    public int pop() {
//        if (top == -1) {
//            System.out.println("stack is empty");
//            return -1;
//        } else {
//            int topElement = arr[top];
//            top--;
//            return topElement;
//        }
//    }
//
//
//    public static void main(String[] args) {
//        MyStack stack = new MyStack();
//    }
//
//}