package exercise;

import group.Dog;

public class DogTry extends Dog {

    public DogTry(int size, String country) {
        super(size, country);
    }

    public static void main(String[] args) {

        Dog doberman = new Dog(6, "Almanya");

        doberman.bark();
        doberman.sleep();
        //doberman.eat();
        //doberman.jump();



    }
}
