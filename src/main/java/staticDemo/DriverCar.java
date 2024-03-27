package staticDemo;

public abstract class DriverCar {
    public void driveForward(){
        System.out.println("Moving forward...");
    }

    public void driveBackwards(){
        System.out.println("Moving backwards...");
    }

    public abstract void flyForward();
}
