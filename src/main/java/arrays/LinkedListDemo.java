package arrays;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();

        cars.add("BMW");
        cars.add("Mercedes");
        cars.add(0, "Audi");
        cars.add("Volvo");
        cars.add("Toyota");

        System.out.println("All cars are: " + cars);

        //selling cars:
        cars.remove("BMW");
        cars.remove(3);

        System.out.println("Available cars for purchase: " + cars);
    }
}
