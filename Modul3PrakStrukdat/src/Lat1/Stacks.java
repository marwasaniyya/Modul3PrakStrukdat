package Lat1;

public class Stacks {
    private int maxSize;
    private String[] stackArray;
    private int top;

    public Stacks(int size) {
        maxSize = size;
        stackArray = new String[maxSize];
        top = -1;
    }

    public void push(String value) {
        stackArray[++top] = value;
    }

    public String pop() {
        return stackArray[top--];
    }

    public String peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize-1);
    }
    public void printStack(Stacks stack) {
        System.out.print("Stack: ");
        for (int i = stack.top; i >= 0; i--) {
            System.out.print(stack.stackArray[i] + " ");
        }
        System.out.println();
    }
    public int search(String value) {
        int index = top;
        while (index >= 0) {
            if (stackArray[index].equals(value)) {
                return top - index + 1;
            }
            index--;
        }
        return -1;
    }
}
