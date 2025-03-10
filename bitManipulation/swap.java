public class swap {


    public static void main(String[] args) {
        int a=4,b=5;

        Integer.toString(b);
        StringBuilder str = new StringBuilder("");
        str.append("hii");
        System.out.println(str);
        str.delete(0, str.length());
        System.out.println(str);
        String str1 = str.toString();
        System.out.println(str1);

        a = a + b;//a=9
        b = a - b;//b=4
        a = a - b;//a=5
        //long  n;


        System.out.println(a);
        System.out.println(b);
    }
}
