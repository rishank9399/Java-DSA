package arrayPart_Questions;

public class triplets {

    public static void triplets_num(int num[]){

        for(int i=0; i<num.length; i++){
            for(int j=0; j<num.length; j++){
                for(int k=0; k<num.length; k++){
                    if((num[i] + num[j] + num[k]) == 0 && (i!=j || i!= k || j!= k)){
                        System.out.println("[ " + num[i] + ", " + num[j] + ", " + num[k] + " ]");
                    }
                }
            }
        }

        return;
    }
    public static void main(String[] args) {
        int num[] = {-1, 0,  1, 2, -1, -4};

        triplets_num(num);
    }
}
