package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException, CookieMonsterException {


            ReadFile.readFile("src/main/resources/hello.txt");

//            System.out.println("Invalid path - " + fnfe.getMessage());
//
//            System.out.println("Problem with the file - " + e.getMessage());

        System.out.println("Will I be executed?");

        try{
            System.out.println(5 / 0);
        }catch (ArithmeticException e){
            throw new CookieMonsterException(e.getMessage(), 5);
        }

    }
}
