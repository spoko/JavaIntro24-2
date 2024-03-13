package oop;

public class Dog extends Pet{
    private boolean hasTail;//specific dog characteristic

    public Dog(String name, byte age, boolean isMale, Breed breed, Address address, boolean hasTail) {
        super(name, age, isMale, breed, address);
        this.hasTail = hasTail;
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
}
