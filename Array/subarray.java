public class subarray {

    public static void subArray(int array[]) {

        int ts = 0;
        
        for(int i=0; i<array.length; i++){
            for(int j=i; j<array.length; j++){
                System.out.print("( ");
                for(int k=i; k<=j; k++){
                    System.out.print(array[k] + " ");
                }
                ts++;
                System.out.print(") , ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Total Subarrays: " + ts);
        return;
    }
    public static void main(String[] args) {

        int arr[]  = {1,2,3,4,5};
        subArray(arr);
        
    }
}
