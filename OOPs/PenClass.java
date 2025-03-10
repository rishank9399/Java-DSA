package OOPs;

public class PenClass {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColour("Yellow");
        System.out.println(p1.getColour());

        p1.setColour("Blue");
        System.out.println(p1.getColour());

        p1.setTip(5);
        System.out.println(p1.gettip());
    }
}

class Pen{

    private String colour;
    private int tip;

    String getColour(){
        return this.colour;
    }

    int gettip(){
        return this.tip;
    }

    void setColour(String newColour){
        this.colour = newColour;
    }

    void setTip(int Tip){
        this.tip = Tip;
    }
}

class Student{

    int age;
    String name;
    float percentage;

    void setAge(int newAge){
        age = newAge;
    }

    void setName(String newName){
        name = newName;
    }

    void setPercentage(int phy, int che, int math){
        percentage = (phy + che + math)/3;
    }
}
