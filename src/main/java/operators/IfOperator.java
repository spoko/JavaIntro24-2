package operators;

public class IfOperator {
    public static void main(String[] args) {
        int a, b;
        a = b = 10;
        //a = 11;

        System.out.println(a > b ? "a is greater" : "b is greater or equals");
        System.out.println(a == b ? "numbers are equal" : "numbers are not equal");
    }
}
