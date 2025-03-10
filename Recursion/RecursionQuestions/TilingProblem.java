package Recursion.RecursionQuestions;

public class TilingProblem {

    public static int find_tile(int breadth,int tileBreadth){
        if(breadth == 0 || breadth == 1){
            return 1;
        }
        return (find_tile(breadth-1, tileBreadth) + find_tile(breadth-2, tileBreadth));
    }
    public static void main(String[] args) {

        int breadth = 4;
        int tileBreadth = 1;

        System.out.println(find_tile(breadth, tileBreadth));
        
    }
}
