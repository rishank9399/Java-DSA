import java.util.Stack;

public class RevString {
    public static String RevString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;

        while(idx != str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuffer revStr = new StringBuffer();
        while(!s.isEmpty()){
            revStr.append(s.pop());
        }

        return revStr.toString();
    }
    public static void main(String[] args) {
        System.out.println(RevString("abc"));
    }
}
