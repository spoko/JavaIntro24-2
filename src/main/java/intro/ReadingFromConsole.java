package intro;

import java.util.Scanner;

public class ReadingFromConsole {
    public static void main(String[] args) {
        //Scanner class is used when we want to read user input from the console:
        Scanner sc = new Scanner(System.in);
        int number = 5;//variable number that will store whole numbers only and currently has value 5

        //Giving info to the user that we expect some input
        System.out.println("Please enter your name:");

        //reading the input using the sc variable
        String userName = sc.nextLine();//reading strings!!!

        //final line of our program - greeting the user
        System.out.println("Nice to meet you, " + userName + "!");

        System.out.println("Please enter your age:");
        int userAge = sc.nextInt();//reading whole number

        System.out.println("What a wonderful age, " + userAge + ".");
    }
}
