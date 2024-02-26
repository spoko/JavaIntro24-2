package data.types;

public class Dog {
    //instance variables i.e. characteristics of a dog:
    String name;
    byte age;
    boolean isMale;
    String breed;

    //static variable
    static String staticName;

    //methods i.e. actions:
    public void bark(){
        //local variable:
        String action = "Bau bau!";
        System.out.println(name + action);
    }

    public void eat(){
        //local variable:
        String action = "Eating...";
        System.out.println(name + action);
    }
}
