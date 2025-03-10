package Linked_List;

public class Linked_list {

    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){

        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;

        tail = newNode;

    }

    public void print(){
        if(head == null){
            System.out.println("LL is null");
            return;
        }
        if(head.next == null){
            System.out.println(head.data);
            return;
        }

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addMiddle(int idx,int data){
        if(idx == 0){
            addFirst(data);
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }
    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty...");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }else{
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty...");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = tail.data;
            head = tail = null;
            size = 0;
            return val;
        }else{
            Node prev = head;

            for(int i=0; i<size-2; i++){
                prev = prev.next;
            }

            int val = prev.next.data;
            prev.next = null;
            tail = prev;
            return val;
        }
    }

    public int iterativeSearch(int key){
        Node temp = head;
        int i = 0;

        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    //Helper function of recursive search
    public int helper(Node head, int key, int idx){
        if(head == null){
            idx = -1;
            return idx;
        }
        if(head.data == key){
            idx = 0;
            return idx;
        }
        idx = helper(head.next, key, idx);
        if(idx != -1){
            idx++;
        }
        return idx;
    }

    public int recSearch(int key){
        int idx = -1;
        return helper(head, key, idx);
    }

    public void deleteNodeFromEnd(int n){
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(n == sz){
            removeFirst();
            return;
        }

        int toDelete = sz-n;
        int i = 1;
        Node prev = head;
        if(i < toDelete){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public boolean palindrom(){
        boolean flag = true;
        Node temp = head;
        int i = 1;
        int sz = 0;

        while(temp != null){
            temp = temp.next;
            sz++;
        }

        int mid = sz / 2;

        temp = head;

        while(i != mid){
            temp = temp.next;
            i++;
        }

        Node prev = null;
        Node curr = temp.next;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }


        Node left = head;
        Node right = prev;
        i=0;

        while(i != mid){
            if(left.data != right.data){
                flag = false;
            }
            left = left.next;
            right = right.next;
            i++;
        }

        return flag;
    }

    public Node midNode(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean palindrom2(){
        if(head == null || head.next == null){
            return true;
        }

        Node midNode = midNode(head);

        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;

        while(right != null ){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;

    }

    public static void main(String[] args) {
        Linked_list ll = new Linked_list();
        
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(3);
        // ll.addLast(5);
        // ll.addMiddle(3, 4);
        // ll.addLast(6);
        // ll.print();
        // // System.out.println(ll.iterativeSearch(4));
        // // System.out.println(ll.recSearch(4));
        // ll.deleteNodeFromEnd(3);
        // ll.print();

        ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(1);
        // ll.addLast(3);
        // ll.addLast(2);
        // ll.addLast(1);

        //ll.print();

        //System.out.println(ll.palindrom());
        

        // ll.addLast(0);

        ll.print();
        System.out.println(ll.palindrom2());
        //System.out.println(ll.palindrom());
    }
}
