package src.dsa.custom.datastructures;

public class StackMain {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.pop(5);
        stack.printStack();
        stack.pop(3);
        stack.printStack();

    }
}
