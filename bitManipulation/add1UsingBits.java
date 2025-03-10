public class add1UsingBits {
    public static void main(String[] args) {
        int x = 5;
        int i = 1;

        if((x & 1) == 0){
            x = x | 1;
        }
        else{
            while(x <= i){
                if((x & (1 << i) ) == 0){
                    x = (~0) << (i-1);
                    x = x | (1<<i);
                    break;
                }
                else{
                    i++;
                }
            }
        }

        System.out.println(x);
    }
}
