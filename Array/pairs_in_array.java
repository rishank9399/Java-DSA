public class pairs_in_array {

    public static void arrayPairs(int array[]) {
        
        for(int i=0; i<array.length; i++){
            for(int j=i; j<array.length; j++){
                System.out.print("("+ array[i] + "," + array[j] + ")" + "  ");
            }
            System.out.println();
        }
        return;
    }
    public static void main(String[] args) {
        int arr[] = {6,7,9,4,3,5,0};

        arrayPairs(arr);
    }
}
