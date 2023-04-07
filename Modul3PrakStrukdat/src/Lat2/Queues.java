package Lat2;

public class Queues {
    private int maxSize;
    private String[] queueArray;
    private int front;
    private int rear;
    private int size;

    public Queues(int size) {
        maxSize = size;
        queueArray = new String[maxSize];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void add(String value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear++;
        queueArray[rear] = value;
        size++;
    }

    public void offer(String value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queueArray[++rear] = value;
        size++;
    }

    public String remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        String value = queueArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        size--;
        return value;
    }

    public String poll() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        String value = queueArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        size--;
        return value;
    }

    public String element() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        return queueArray[front];
    }

    public String peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        return queueArray[front];
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean isFull() {
        return (size == maxSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (!isEmpty()) {
            sb.append(queueArray[front]);
            for (int i = front + 1; i <= rear; i++) {
                sb.append(", ");
                sb.append(queueArray[i]);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
