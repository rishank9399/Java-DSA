package Divide_Conquer;

public class MergeSort {

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int arr[], int si, int ei){
        int mid = si + (ei -si)/2; 

        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);

        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){
       int temp[] = new int[ei-si+1];
       int i = si; 
       int j = mid+1;
       int k = 0;
    }
    public static void main(String[] args) {
       
        int arr[] = {6, 3, 9, 5, 2, 8};
    }
}
