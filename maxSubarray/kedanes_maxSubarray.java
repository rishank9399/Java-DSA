package maxSubarray;

public class kedanes_maxSubarray {

    public static void kedanes(int arr[]){
        int currentSum = 0;
        int maximum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            currentSum+=arr[i];

            if(currentSum<0){
                currentSum = 0;
            }

            maximum = Math.max(currentSum, maximum);
        }
        System.out.println("Maximum: " + maximum);
    }
    
    public static void main(String[] args) {
        int arr[] = {1,3,8,9,10};
        kedanes(arr);
    }
}
