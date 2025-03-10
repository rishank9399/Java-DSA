package maxSubarray;

public class MaxSubarray {

    public static void minMaxArray(int sumarr[]){

        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;

        for(int i=0; i<sumarr.length; i++){

            if(minimum>sumarr[i]){
                minimum = sumarr[i];
            }
            if(maximum < sumarr[i]){
                maximum = sumarr[i];
            }
        }

        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);

        return;
    }

    public static void  subarray(int arr[]){

        int index = 0;
        int size = (arr.length * (arr.length+1)) / 2;
        int sumarr[] = new int[size];

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    sum+=arr[k];
                }
                sumarr[index] =  sum;
                index++;
            }
        }

        for(int i=0; i<sumarr.length; i++){
            System.out.print(sumarr[i] + " ");
        }

        System.out.println();
        System.out.println();

        minMaxArray(sumarr);

        return;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,8,9,10};

        //minMaxArray(arr);

        subarray(arr);
    }
}
