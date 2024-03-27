package staticDemo;

public class Audi extends Car{
    private boolean isQuattro;

    public boolean isQuattro() {
        return isQuattro;
    }

    public Audi(String model, String brandName, String color, boolean isQuattro) {
        super(model, brandName, color);
        this.isQuattro = isQuattro;
    }

    @Override
    public void flyForward() {
        System.out.println("Audi is flying forward");
    }

    //we cannot change/ override a final method
//    public void printCarDetails(){
//
//    }
}
