package Lat1;

public class Main {
    public static void main(String[] args) {
        Stacks myStack = new Stacks(5);
        myStack.push("Aku");
        myStack.push("Anak");
        myStack.push("Indonesia");

        System.out.println("Next : " + myStack.peek());
        myStack.push("Raya");
        System.out.println(myStack.pop());

        int count = myStack.search("Aku");
        while (count > 1){
            myStack.pop();
            count--;
        }
        System.out.println(myStack.pop());
        System.out.println(myStack.isEmpty());
    }
}

