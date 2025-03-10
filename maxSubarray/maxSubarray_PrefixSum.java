package maxSubarray;

public class maxSubarray_PrefixSum {

    public static void PrefixSum(int arr[]){

        int maximum = Integer.MIN_VALUE;
        int prefixSum[] = new int[arr.length];

        prefixSum[0] = arr[0];
        for(int i=1; i<prefixSum.length; i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        for(int i=0; i<arr.length; i++){
            int currentSum = 0;
            for(int j=i; j<arr.length; j++){
                currentSum = i == 0 ? prefixSum[j] : prefixSum[j] - prefixSum[i-1];
            }
            if(maximum < currentSum){
                maximum = currentSum;
            }
        }
        System.out.println("Maximum: " + maximum);

        return;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,8,9,10};
        PrefixSum(arr);
    }
}
