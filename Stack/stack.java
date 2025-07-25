public class stack {
    int[] arr;
    int top;

    stack(int size) {
        arr = new int[size];
        top = -1;
    }

    void push(int d) {
        if (top == arr.length-1) {
            System.out.println("Stack is Overflow");
        } else {
            top++;
            arr[top] = d;
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("stack is underflow");
        } else {
            top--;
        }
    }

    void peek() {
        if (top == -1) {
            System.out.println("stack is empty");
        } else {
            System.out.println(arr[top]);
        }
    }

    void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        stack m = new stack(5);
        m.push(10);
        m.push(20);
        m.push(30);
        m.push(40);
        m.push(50);
        m.peek();
        m.display();
        m.pop();
        m.peek();
        m.display();
    }
}



