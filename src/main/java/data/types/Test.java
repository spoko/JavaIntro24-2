package data.types;

public class Test {
    public static void main(String[] args) {
        //local variable:
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        System.out.println("Dog details:");
        System.out.println(dog1.name);//Morti;name:
        System.out.println(dog1.age);//3; age:
        System.out.println(dog1.isMale);//true; isMale:
        System.out.println(dog1.breed);//French Bulldog; breed:

        dog1.name = "Morti";
        dog1.isMale = true;
        dog1.age = (byte) 3;
        dog1.breed = "French Bulldog";

        System.out.println("Dog details after edit:");
        System.out.println(dog1.name);
        System.out.println(dog1.age);
        System.out.println(dog1.isMale);
        System.out.println(dog1.breed);

        dog2.name = "Sharka";
        dog2.isMale = false;
        dog2.age = (byte) 5;
        dog2.breed = "German Shepard";

        System.out.println("--------------");

        System.out.println(Dog.staticName);//null

        System.out.println("--------------");

        Dog.staticName = "Dog1 static name";
        dog1.staticName = "X";
        dog2.staticName = "Y";

        System.out.println(dog1.staticName);
        System.out.println(dog2.staticName);
    }
}
