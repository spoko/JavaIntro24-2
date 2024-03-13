package oop;

public class Cat extends Pet {
    private boolean hasFur;

    public Cat(String name, byte age, boolean isMale, Breed breed, Address address, boolean hasFur) {
        super(name, age, isMale, breed, address);
        this.hasFur = hasFur;
    }

    //method override
    public void eat(){
        System.out.println("Smell, taste, eat, repeat...");
    }

    public void meow(){
        System.out.println("Meow meow...");
    }
}
