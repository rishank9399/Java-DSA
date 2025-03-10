package maxSubarray;

public class maxSubarray_bruteForce {

    public static void bruteForce(int arr[]){

        int maximum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int current_Sum = 0;
                for(int k=i; k<=j; k++){
                    current_Sum+=arr[k];
                }
               if(maximum < current_Sum){
                    maximum = current_Sum;
               }
            }
            
        }

        System.out.println("Maximum: " + maximum);
    }

    public static void main(String[] args) {
        int arr[] = {1,3,8,9,10};

        bruteForce(arr);
    }
}
