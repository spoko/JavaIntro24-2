package staticDemo;

public class Car extends DriverCar { //extends FinalClass { We cannot extend final class!!!
    //accessed using the instance/ object i.e. different for each one
    private String model;
    private String color;

    //accessed using the class - one for all objects
    private static int counter;

    protected final String BRAND_NAME;// = "Mercedes"; //either we shall give initial value here or in the constructor

    protected final static boolean FOUR_WHEEL_DRIVE;// = true; // weh shall give value here or in a static initializer

    public String getColor() {
        return color;
    }

    //static initializer
    static {
        System.out.println("Calling static initializer");
        FOUR_WHEEL_DRIVE = false;
    }

    public void setColor(String color) {
        if (!color.isEmpty()){
            this.color = color;
        }else {
            System.out.println("ERROR");
        }
    }

    public String getModel() {
        return model;
    }

    private void setModel(String model) {
        if (!model.isEmpty()){
            this.model = model;
        }else {
            System.out.println("Error");
        }
    }

    public static int getCounter() {
        return counter;
    }

    public Car(String model, String brandName, String color){
        System.out.println("Calling the constructor");
        setModel(model);
        setColor(color);
        counter++;
        BRAND_NAME = brandName;
        //FOUR_WHEEL_DRIVE = true; //we cannot give value here since this is a static constant
    }

    public final void printCarDetails(){
        System.out.printf("Brand name is: %s, model is: %s, color is: %s.\n",
                BRAND_NAME, model, color);
    }

    @Override
    public void flyForward() {

    }
}
