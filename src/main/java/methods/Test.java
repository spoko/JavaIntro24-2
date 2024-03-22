package methods;

public class Test {
    public static void main(String[] args) {
        MethodsDemo.printPositiveNumbersToN(5);//static method can be accessed directly from the class. Parameter as value directly

        MethodsDemo methodsDemo = new MethodsDemo();//if we need access to a non-static method, first we need an object from that class
        String result = methodsDemo.getMoodOfTheDay();//now we can access all non-static i.e. instance methods
        System.out.println(result);

        MethodsDemo.printPositiveNumbersToN(methodsDemo.getPositiveNumber());//static method can be accessed directly from the class. Parameter as reference

        methodsDemo.sum(methodsDemo.average(4, 5), methodsDemo.average(5, 6));
    }
}
