public class valuePassing {

    public static void update(int marks[], int nonchangeable){

        nonchangeable = 10;
        for(int i=0; i<marks.length; i++){
            marks[i] =  marks[i] + 1;
        }
    }
    public static void main(String[] args) {

        int marks[] = {69, 89, 99};
        int nonChangeable = 5;

        //pass by reference
        //pass by value
        update(marks, nonChangeable);

        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i] + " ");
        }
    }
}
