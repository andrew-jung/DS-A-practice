public class QueueEx {
// First in, first out
// Missing null pointer checks
    public static class Queue {
        private static class Node{
            private int data;
            private Node next;
            private Node (int data){
                this.data = data;
            }
        }
        private Node head; // remove from here
        private Node tail; // add things here

        public boolean isEmpty(){
            return head == null;
        }
        public int peek(){
            return head.data; // throws exception if head is null
        }

        public void add(int data){ // Add to the tail.
            Node node = new Node(data);
            if (tail!=null){ // If tail is not null,
                tail.next = node;
            }
            tail = node;// update tail

            if(head == null){ // if head is empty
                head = node;
            }
        }
        public int remove(){
            int data = head.data;
            head = head.next; // remove from queue
            if(head == null){
                tail = null;
            }
            return data;
        }
    }
}
