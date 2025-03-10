public class bubbleSort {

    // public static void bubble_Sort(int arr[]){
    //     for(int i=0; i<arr.length-1; i++){
    //         for(int j=0; j<arr.length-1-i; j++){
    //             if(arr[j] > arr[j+1]){
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;
    //             }
    //         }
    //     }
    //     return;
    // }

    public static void bubble_Sort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int swaps = 0;
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
            if(swaps == 0){
                return ;
            }
        }
        return ;
    }

    public static void print_Array(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        bubble_Sort(arr);
        print_Array(arr);
    }
}
