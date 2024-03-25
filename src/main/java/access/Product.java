package access;

public class Product {
    public String publicName;
    protected String protectedName;
    String defName;
    private String prName;

    public void publicMethod(){
        System.out.println("Calling public method");
    }

    protected void protectedMethod(){
        System.out.println("Calling protected method");
    }

    void defaultMethod(){
        System.out.println("Calling default method");
    }

    private void privateMethod(){
        System.out.println("Calling private method");
    }
}
