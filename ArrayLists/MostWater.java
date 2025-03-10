import java.util.ArrayList;

public class MostWater {

    public static int MostWater_BruteForce(ArrayList<Integer> height){
        int water = 0;
        for(int i=0; i<height.size(); i++){
            for(int j=i+1; j<height.size(); j++){
                int minHeight = Math.min(height.get(i), height.get(j));
                int width = j-i;
                water = Math.max(water, (minHeight * width));
            }
        }
        return water;
    }

    public static int MostWater_TwoPointer(ArrayList<Integer> height){

        int water = 0;
        int lp = 0;
        int rp = height.size()-1;

        while(lp<=rp){

            int minHeight = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp;
            water = Math.max(water, (minHeight * width));

            if(height.get(lp) < height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return water;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(MostWater_BruteForce(list));
        System.out.println(MostWater_TwoPointer(list));
    }
}
