package Recursion;

public class occurence {

    public static int FirstOccurence(int arr[],int key,  int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return FirstOccurence(arr, key, i+1);
    }

    public static int lastOccurence(int arr[], int key, int i){

        if(i == arr.length){
            return -1;
        }

        int isFound = lastOccurence(arr, key, i+1);

        if(isFound != -1){
            return isFound;
        }
        if(arr[i] == key){
            isFound = i;
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {5,3,4,6,78,5,8,5,0};
        int key = 5;
        
        //System.out.println(FirstOccurence(arr, 5, 0));
        System.out.println(lastOccurence(arr, key, 0));
    }
}
