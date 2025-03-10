package practiceQuestion;

import java.util.ArrayList;

public class MostFrequentNum {

    public static int mostFrequent(ArrayList<Integer> nums, int key){
        int frequency[] = new int[1001];

        for(int i=0; i<nums.size(); i++){
            if(nums.get(i) == key){
                frequency[nums.get(i+1)]++;
            }
        }

        int maxNum = Integer.MIN_VALUE;
        int target = -1;
        for(int i=0; i<frequency.length; i++){
            if(frequency[i] > maxNum){
                maxNum = frequency[i];
                target = i;
            }
        }

        return target;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(3);

        System.out.println(mostFrequent(nums, 2));
        
    }
}
