package Recursion.RecursionQuestions;

public class FriendsParingProblem {

    public static int pairedFriends(int n){
        if(n == 1 || n == 2){
            return n;
        }

        return pairedFriends(n-1) + (n-1) * pairedFriends(n-2);
    }
    public static void main(String[] args) {
        System.out.println(pairedFriends(5));
    }
}
