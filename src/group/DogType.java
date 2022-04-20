package group;

public class DogType {

    public static void main(String[] args) {

        Dog kangal = new Dog(5, "Turkiye");

        kangal.sleep();
        kangal.bark();
        kangal.jump();
        //kangal.eat();

        Dog berger = new Dog(-6, "Belcika", "Kirmizi");

        berger.sleep();
        berger.bark();

        System.out.println(berger);

        berger.setCountry("Hollanda");
        System.out.println(berger);

    }


}
