package data.types;

public class StringActionsDemo {
    public static void main(String[] args) {
        String testString = "Blah blah blah";

        System.out.println(testString.length());//14

        System.out.println(testString.contains(" "));
        System.out.println(testString.charAt(4));//" "
    }
}
