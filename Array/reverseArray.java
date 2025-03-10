public class reverseArray {

    public static void reverse_array(int arr[]){
        int pointer_1 = 0;
        int pointer_2 = arr.length - 1;
        
        while(pointer_1 < pointer_2){
            int temp =arr[pointer_1];
            arr[pointer_1] = arr[pointer_2];
            arr[pointer_2] = temp;

            pointer_1++;
            pointer_2--;
        }

        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");

        return;
    }

    public static void main(String[] args) {
                
        int arr[] = {1,4,2,3,5,0,9,8,6,7};

        reverse_array(arr);
    }
}
