package loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        int rndNumber = -4;

        do{
            System.out.printf("Current number is: %d\n", rndNumber);
            rndNumber--;
        }while (rndNumber >= 0);
    }
}
