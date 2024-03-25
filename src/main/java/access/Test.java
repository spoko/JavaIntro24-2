package access;

public class Test {
    public static void main(String[] args) {
        Product product = new Product();

        //we can access all public stuff (from anywhere)
        System.out.println(product.publicName);
        product.publicMethod();

        //we can access all the default stuff since we are in the same package
        System.out.println(product.defName);
        product.defaultMethod();

        //we can access all the protected stuff since we are
        System.out.println(product.protectedName);
        product.protectedMethod();

        //cannot access anything that is private
    }
}
