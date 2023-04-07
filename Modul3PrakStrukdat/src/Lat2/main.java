package Lat2;

public class main {
    public static void main(String[] args) {
        Queues myQueue = new Queues(4);
        myQueue.add("Java");
        myQueue.add("DotNet");
        myQueue.offer("PHP");
        myQueue.offer("HTML");

        System.out.println(myQueue);
        System.out.println("Remove: " + myQueue.remove());
        System.out.println(myQueue);
        System.out.println("Element: " + myQueue.element());
        System.out.println(myQueue);
        System.out.println("Poll: " + myQueue.poll());
        System.out.println(myQueue);
        System.out.println("Peek: " + myQueue.peek());
    }
}
