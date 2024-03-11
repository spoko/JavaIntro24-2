package arrays;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> randomText = new ArrayList<>();
        System.out.println(randomText.size());

        randomText.add("I will be first");
        System.out.println(randomText.size());
        randomText.add(0, "I will be the new first");
        System.out.println(randomText.size());
        randomText.add("Some random text 3");
        System.out.println(randomText.size());

        System.out.println(randomText);

        randomText.remove(0);
        System.out.println(randomText.size());
        System.out.println(randomText.remove("I will be first"));
        System.out.println(randomText.size());

        System.out.println(randomText);
    }
}
