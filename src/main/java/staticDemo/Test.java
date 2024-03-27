package staticDemo;

public class Test {
    public static void main(String[] args) {
        System.out.printf("Currently we have created %d car(s)\n", Car.getCounter());
        Car car1 = new Car("E55", "Mercedes", "black");
        Car car2 = new Car("F50", "Ferrari", "red");
        System.out.printf("Currently we have created %d car(s)\n", Car.getCounter());

        System.out.println(car2.getCounter());
        System.out.println(car1.getCounter());

        System.out.println(car1.BRAND_NAME);
        //car1.BRAND_NAME = "Changed"; //we cannot change value of a final variable i.e. constant
        System.out.println(car2.BRAND_NAME);
        car2.setColor("green"); //we can change instance variable

        car1.printCarDetails();
        car2.printCarDetails();
    }
}
