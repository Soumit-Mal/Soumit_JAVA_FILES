class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    public void breathe() {
        System.out.println(name + " is breathing.");
    }
}

class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.eat();
        dog.breathe();
        dog.bark();
    }
}
