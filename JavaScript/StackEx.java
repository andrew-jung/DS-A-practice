import java.util.Arrays;

public class StackEx { // Last in, first out
    // Missing null pointer checks

    public static class Node{
        private int data;
        private Node next;
        private Node (int data) {
            this.data = data;
        }
    }
    private Node top; // Add and remove from top, no tail

    public boolean isEmpty(){
        return top == null;
    }
    public int peek(){
        return top.data;
    }
    public void push(int data){
        Node node = new Node(data); // create new node
        node.next = top; // make node top
        top = node;
    }
    public int pop(){
        int data = top.data; // get top data
        top = top.next; // move top to next element down
        return data;
    }
}
