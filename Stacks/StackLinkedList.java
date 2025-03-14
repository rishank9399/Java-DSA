// import java.util.LinkedList;

public class StackLinkedList {

    static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class StackLL{
        //LinkedList<Integer> ll = new LinkedList<>();
        static Node head;

        public boolean isEmpty(){
            return head == null;
        }

        public void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public int pop(){
            if(isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }

    }

    
    public static void main(String[] args) {
        StackLL s = new StackLL();
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
