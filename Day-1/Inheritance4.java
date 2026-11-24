
public class Inheritance4 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark("domestic");
        d.eat();
    }
}

class Animal {
    String name = "komala";

    void eat() {
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal {
    void bark(String breed) {
        System.out.println(name + " the " + breed + " dog is barking");
    }
}
