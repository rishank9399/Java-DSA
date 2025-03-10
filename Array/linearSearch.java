public class linearSearch {

    public static int LinearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1, 3, 6, 4,8, 10, 44, 7, 9};
        int key = 10;

        int index = LinearSearch(numbers, key);

        if(index >= 0){
            System.out.println("Key is at index : " + index);
        }
        else{
            System.out.println("Key not found...");
        }
    }
}

//menu string array
