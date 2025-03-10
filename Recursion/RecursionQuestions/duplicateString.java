package Recursion.RecursionQuestions;

public class duplicateString {

    public static void findUnique(String s, int index, StringBuilder sb, boolean arr[]){
        //arr[index] = 'a' + index;

        if(index == s.length()){
            System.out.println(sb);
            return;
        }
        int i = s.charAt(index) - 'a';
        if(arr[i] == true){
            findUnique(s, index+1, sb, arr);
        }else{
            arr[i] = true;
            findUnique(s, index+1, sb.append(s.charAt(index)), arr);
        }
    }
    public static void main(String[] args) {
        String s = "appnacollege";
        int index = 0;
        StringBuilder sb = new StringBuilder();
        boolean arr[] = new boolean[26];

        findUnique(s, index, sb, arr);
    }
}
