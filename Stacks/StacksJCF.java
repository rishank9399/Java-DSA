import java.util.Stack;

public class StacksJCF {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(7);
        s.push(8);

        while(!s.isEmpty()) 
            System.out.print(s.pop() + " ");
        


    }
}
