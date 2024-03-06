package loops;

public class WhileLoop {

    public static void main(String[] args) {
        printFactorial(0);
        printFactorial(1);
        printFactorial(5);
        printFactorial(-5);

        System.out.println("---------");

        printPositiveNumbersToN(5);

        System.out.println("---------");

        printPositiveNumbersToN(-4);
    }

    public static void printFactorial(int n){
        if (n < 0){
            System.out.println("N cannot be negative!");
            return;
        }

        //local variable
        int iterator = n;
        int factorial = 1;

        //while loop
        while (iterator > 0){
            factorial *= iterator;
            iterator--;//decrement the iterator
        }

        //print the result
        System.out.printf("You entered %d. %d! = %d\n", n, n, factorial);
    }

    public static void printPositiveNumbersToN(int n){
        if (n < 0){
            System.out.println("Invalid input!");
            return;
        }

        int counter = 0;

        while (counter != (n + 1)){
            System.out.println(counter);
            counter++;//increment the counter
        }
    }
}
