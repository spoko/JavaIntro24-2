package methods;

public class MethodsDemo {
    //static method that won`t return a value. It will print some numbers to n, n as parameter
    public static void printPositiveNumbersToN(int n){
        if (n < 0){
            System.out.println("Invalid input");
            return;
        }

        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
        System.out.println(n);
    }

    //non-static method that will return a String
    public String getMoodOfTheDay(){
        return "Luck";
    }

    public int getPositiveNumber(){
        return 3;
    }

    public int average(int a, int b){
        return 3;
    }

    public int sum(int a, int b){
        return 7;
    }
}
