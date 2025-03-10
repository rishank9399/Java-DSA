package practiceQuestion;

import java.util.ArrayList;
import java.util.Scanner;

public class BeautifulArray {

    public static ArrayList<Integer> beautifulArray(int n){

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);

        
        int ans_size = ans.size();

        while(ans_size < n){
            
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i=0; i<ans_size; i++){
                if(ans.get(i)*2-1 <= n){
                    temp.add(ans.get(i)*2-1);
                }
            }

            for(int i=0; i<ans_size; i++){
                if(ans.get(i)*2 <= n){
                    temp.add(ans.get(i)*2);
                }
            }

            ans = temp;
            ans_size = ans.size();
        }

        return ans;
    }
    public static void main(String[] args) {
        //if 0<i, j<n; i + j != k*2;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(beautifulArray(n));

        sc.close();
    }
}
