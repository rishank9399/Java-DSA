//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct

package arrayPart_Questions;

public class repeat {

    public static boolean repeatNum(int arr[]){

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1};

        System.out.println(repeatNum(arr));
    }
}
