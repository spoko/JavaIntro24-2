package oop;

public class Test {
    public static void main(String[] args) {
        //Breed frenchie = new Breed("French Bulldog","Crazy","A lot");
        Breed persian = new Breed("Persian", "Playfull", "no");
        Address dogAddress1 = new Address("Bulgaria", "Sofia", 23423);
        Address defaultAddress = new Address();
        Address catAddress1 = new Address("Bulgaria", "Sofia", 34521);

        //Dog morti = new Dog("Morti", (byte) 3, true, frenchie, dogAddress1, false);
        Dog morti = Dog.getFrenchie("Morti", (byte) 3, true, dogAddress1, false);
        Cat sisa = new Cat("Sisa", (byte) 2, false, persian, catAddress1, true);

        morti.eat();
        sisa.eat();
        morti.bark();
        sisa.meow();

        morti.printData();
        sisa.printData();

        morti.play();
        morti.play("ball");

    }
}
