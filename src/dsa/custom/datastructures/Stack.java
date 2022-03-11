package src.dsa.custom.datastructures;

public class Stack {

    private int top;
    private int[] arr;
    private int capacity;

    public Stack(int size){
        this.arr = new int[size];
        this.capacity = size;
        this.top = -1;
    }

    public int push(int element){
        if(isFull()){
            System.out.println("Stack is Full");
            System.exit(1);
        }
        return  arr[++top] = element;
    }

    public int pop(int element){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            System.exit(1);
        }
       return  arr[top--];

    }

    private boolean isFull(){
        return  top == capacity-1;
    }

    private boolean isEmpty(){
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }
}
