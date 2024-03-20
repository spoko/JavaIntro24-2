package decision;

public class DecisionMaking {
    public static String name;
    public  String nonStaticName;
    public static void main(String[] args) {
        printUserDetails(-1);
        printUserDetails(0);
        printUserDetails(6);//optional
        printUserDetails(12);
        printUserDetails(13);
        printUserDetails(15);//optional
        printUserDetails(19);
        printUserDetails(20);
        printUserDetails(55);//optional
        printUserDetails(65);
        printUserDetails(66);
        printUserDetails(120);//optional
        printUserDetails(130);
        printUserDetails(131);

        System.out.println("-----------");

        printMonthOfTheYear(4);
    }

    public static void printUserDetails(int age){
        //kid: 0 - 12
        //teenager: 13 - 19
        //adult: 20 - 65
        //retired: 66 - 130
        if (age < 0 || age > 130){
            System.out.println("Error: Invalid entry. Number must be positive and less than 130!");
            return;
        }

        if (age >= 0 && age <= 12){
            System.out.println("Hello kiddo!");
        } else if (age >= 13 && age <= 19 ) {
            System.out.println("Whatzzzzz uppp teenager!");
        } else if (age >= 20 && age <= 65) {
            System.out.println("I feel sorry for you cause you have to work ;(");
        } else if (age >= 66 && age <= 130) {
            System.out.println("Happy traveling!");
        }

        System.out.println(name);//we can access static fields
        //System.out.println(nonStaticName);//we cannot access non-static fields inside static methods
    }

    public static void printMonthOfTheYear(int month){
        switch (month){
            case 1:
                System.out.println("The selected month is January");
                break;
            case 2:
                System.out.println("The selected month is February");
                break;
            default:
                System.out.println("Invalid entry! Please enter number between 1 and 12!");
        }
    }
}
