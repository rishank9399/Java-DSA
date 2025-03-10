package practiceQuestion;

import java.util.ArrayList;
import java.util.Collections;

public class LonelyNumber {

    public static ArrayList<Integer> lonelyNumber(ArrayList<Integer> nums){
        Collections.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.size(); i++){

            if(i==0){
                if(nums.get(i) != nums.get(i+1) && (nums.get(i+1) != nums.get(i)+1)){
                    list.add(nums.get(i));
                }

            }
            
            else if(i == nums.size()-1){
                if(nums.get(i) != nums.get(i-1) && nums.get(i-1) != nums.get(i)-1){
                    list.add(nums.get(i));
                }
            }
            else{
                if(nums.get(i) != nums.get(i-1) && nums.get(i) != nums.get(i+1) && nums.get(i+1) !=  nums.get(i)+1 && nums.get(i-1) !=  nums.get(i)-1){
                    list.add(nums.get(i));
                }
            }    
        }
        return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(8);
        list.add(3);
        list.add(5);
        list.add(9);
        list.add(11);
        list.add(15);

        System.out.println(list);

        System.out.println(lonelyNumber(list));
    }
}
