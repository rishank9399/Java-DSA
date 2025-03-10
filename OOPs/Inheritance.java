package OOPs;

public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}
class Animal{
    String colour;

    void eat() {
        System.out.println("Eats");
    }

    void breath() {
        System.out.println("Breaths");
    }
}

class Fish extends Animal {
    int fins;

    void swim(){
        System.out.println("Swims in water");
    }
}
