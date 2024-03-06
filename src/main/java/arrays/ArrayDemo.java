package arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        //arrays
        int [] numbers = {4, 5, 3, 56, 7, 6};
        int [] numbers2 = new int[10];

        String [] cities = {"Sofia", "Plovdiv", "Varna", "Burgas", "Blagoevgrad"};
        String [] cities2 = new String[20];

        boolean [] answers = new boolean[20];
        boolean [] answers2 = {true, false, false, true};

        //random access
        System.out.println(numbers[4]);//7
        System.out.println(numbers2[4]);//0

        System.out.println(numbers);//prints the object from the static memory :)

        System.out.println("--------");
        printElementsOfNumberArray(numbers);

        System.out.println("--------");
        printElementsOfNumberArray(numbers2);

        System.out.println("--------");
        printElementsOfStringArray(cities);

        System.out.println("--------");
        printElementsOfStringArray(cities2);
    }

    public static void printElementsOfNumberArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Current index is: %d. Value is: %d\n", i, array[i]);
        }
    }

    public static void printElementsOfStringArray(String [] array){
//        for (int i = 0; i < array.length; i++) {
//            System.out.printf("Current index is: %d. Value is: %s\n", i, array[i]);
//        }
        int iterator = 0;
        for (String element : array){
            //System.out.println(element);
            System.out.printf("Current index is: %d. Value is: %s\n", iterator, element);
            iterator++;
        }
    }
}
