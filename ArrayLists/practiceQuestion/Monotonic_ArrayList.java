package practiceQuestion;

import java.util.ArrayList;

public class Monotonic_ArrayList {

    public static boolean monotonicArrayList(ArrayList<Integer> nums){
        boolean inc = true;
        boolean dec = true;
        for(int i=0; i<nums.size()-1; i++){
            if(nums.get(i) > nums.get(i+1)){
                inc = false;
            }

            if(nums.get(i) < nums.get(i+1)){
                dec = false;
            }
        }
        return inc || dec;
    }
    public static void main(String[] args) {
        
    ArrayList<Integer> list = new ArrayList<>();
    
    list.add(1);
    list.add(2);
    list.add(9);
    list.add(4);

    System.out.println(monotonicArrayList(list));

    }
}
