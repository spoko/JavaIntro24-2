package access2;

//import access.*;
import access.Product;

public class Test {
    public static void main(String[] args) {
        Product product = new Product();
        Soap dove = new Soap();//subclass in current package

        //we can access all public stuff (from anywhere)
        System.out.println(product.publicName);
        product.publicMethod();

        //we cannot access all the default stuff since we are in the different package
//        System.out.println(product.defName);
//        product.defaultMethod();

        //we can access all the protected stuff if we are using a subclass from current package
        System.out.println(dove.getProtectedName());
        dove.callProtectedMethod();

        //cannot access anything that is private
    }
}
