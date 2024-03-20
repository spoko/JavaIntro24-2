package oop;

public class Dog extends Pet{
    private boolean hasTail;//specific dog characteristic

    public Dog(String name, byte age, boolean isMale, Breed breed, Address address, boolean hasTail) {
        super(name, age, isMale, breed, address);
        this.hasTail = hasTail;
    }

    public Dog(){

    }

    //Factory method because it will return object from the current class
    public static Dog getFrenchie(String name, byte age, boolean isMale, Address address, boolean hasTail){
        Breed frenchie = new Breed("French Bulldog", "Crazy", "Lower back issues");
        return new Dog(name, age, isMale, frenchie, address, hasTail);
    }

    public void bark(){
        System.out.printf("%s is barking...\n", super.getName());
    }

    //method override
    public void eat(){
        System.out.println("Food is gone in a second!");
    }

    //method overload:
    public void play(){
        System.out.printf("%s is playing...\n", super.getName());
    }

    //method overload:
    public void play(String toy){
        System.out.printf("%s is playing with %s\n", super.getName(), toy);
    }

    //cast a Pet to a Dog
    public Dog getADog(){
        return (Dog) new Pet();
    }

    public Pet getAPet(){
        return new Dog();
    }
}
