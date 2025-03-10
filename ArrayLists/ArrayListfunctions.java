import java.util.ArrayList;

public class ArrayListfunctions {

    public static int findMax(ArrayList<Integer> list){

        int max = Integer.MIN_VALUE;

        for(int i=0; i<list.size(); i++){
            if(max < list.get(i)){
                max = list.get(i);
            }
        }

        return max;
    }

    public static void swap (ArrayList<Integer> list , int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
       list.add(0);
       list.add(1);
       list.add(9);
       list.add(3);
       list.add(4);

       System.out.println(list);

       swap(list, 1, 4);

       System.out.println(list);
       
       //System.out.println("Maximum number in ArrayList : " + findMax(list));
    }
}
