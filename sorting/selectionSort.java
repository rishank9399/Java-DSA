public class selectionSort {

    public static void selection_Sort(int arr[]){

        for(int i=0; i<arr.length-1; i++){
            int minimum = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minimum] > arr[j]){
                    minimum = j;
                }
            }
            int temp = arr[minimum];
            arr[minimum] = arr[i];
            arr[i] = temp;
        }
        print_Array(arr);
    } 

    public static void print_Array(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,2,4,1,3};

        selection_Sort(arr);
    }
}
