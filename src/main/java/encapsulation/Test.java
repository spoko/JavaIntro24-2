package encapsulation;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Person elena = new Person("Elena", 11);
        Person alex = new Person("Alex", 4);

        Product coffee = new Product("Coffee", 10);
        Product tea = new Product("Tea", 2);

        elena.buyProduct(coffee);
        alex.buyProduct(tea);
        alex.buyProduct(tea);
        elena.buyProduct(tea);

        elena.printItemsFromTheBag();
        alex.printItemsFromTheBag();

        sumTillInputFibonacci();
    }

    public static void sumTillInputFibonacci() {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter Fibonacci's sequence lenght:");

        int n = userInput.nextInt();

        int firstFib = 0;

        int secondFib = 1;

        int sumTotal = 0;

        for (int i = 0; i < n; i++) {

            sumTotal +=firstFib;

            int nextFib = firstFib + secondFib;

            firstFib = secondFib;

            secondFib = nextFib;
        }

        System.out.printf("Sum of the numbers until %d from Fibonacci's sequence is equal to: %d", n, sumTotal);
    }
}
