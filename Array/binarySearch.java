public class binarySearch {

    public static int BinarySearch(int numbers[], int key){
        int start = 0;
        int end =  numbers.length - 1;
        for(int i=0; i<=numbers.length-1; i++){
            int mid = (start + end) / 2;
            
            if(numbers[mid] == key){
                return mid;
            }
            else if(key > numbers[mid]){
                start = mid;
            }
            else{
                end = mid;
            }

        }

        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1, 3, 5, 6, 7, 9, 12, 18};
        int key = 12;

        //int index = BinarySearch(numbers, key);

        System.out.println(BinarySearch(numbers, key));
    }
}
