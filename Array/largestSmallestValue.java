public class largestSmallestValue {

    public static int getLargest(int numbers[]){

        int largest  = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }

        return largest;
    }

    public static int getSmallest(int numbers[]){
        int smallest  = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }

        return smallest;
    }

    public static void main(String[] args) {

        int numbers[] = {1,4,7,3,9,8,6};

        int ans[] = new int[2 * numbers.length - 1];

        ans = numbers;
        

        for(int i=0; i<numbers.length; i++){
            ans[ans.length] = numbers[i];
        }

        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }

        // int largestNum = getLargest(numbers);
        // int smallestNum = getSmallest(numbers);

        // System.out.println("Largest number in the Array is : " + largestNum);
        // System.out.println("Smallest number in the Array is : " + smallestNum);

    }
}
