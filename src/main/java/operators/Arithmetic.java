package operators;

public class Arithmetic {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        System.out.println(a % b);//2

        System.out.println(a++);//5

        System.out.println(a);//6

        System.out.println(++b);//4

        System.out.println(a == b);//false
        System.out.println(a != b);//true
        System.out.println(a >= b);//true

    }
}
