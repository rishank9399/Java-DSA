package Linked_List;

public class CyclicLL {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public void addLast(int data){

        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        return;
    }

    public static boolean isCycle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    public static void removeCycle(){
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        //Detect Cycle
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }
        //Meeting point
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        //Remove cycle
        prev.next = null;
    }

    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        //CyclicLL ll = new CyclicLL();

        head = new Node(1);
        Node temp = new Node(2);
        head.next =temp;
        temp.next = new Node(2);
        temp.next.next = new Node(3);
        temp.next.next.next = new Node(4);
        temp.next.next.next.next = temp;

        System.out.println(isCycle(head));
        removeCycle();
        System.out.println(isCycle(head));
        
    }
}
