package Strings;

public class strings_concatenation {

    public static void printLetters(String str){
        System.out.println();

        for(int i=0; i<str.length(); i++){
            System.out.print( "_ ");
        }

        System.out.println();
        System.out.println();

        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }

        System.out.println();

        for(int i=0; i<str.length(); i++){
            System.out.print( "_ ");
        }
        System.out.println();
        System.out.println();
    }
    public static void main(String[] args) {
        String firstName = "Rishank";
        String lastName = new String("Gupta");

        if(firstName.compareToIgnoreCase(lastName) > 0){

        }

        String fullName = firstName + " " +lastName;

        System.out.println(fullName);

        printLetters(fullName);
    }
}
