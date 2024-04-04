package inheritance;

import inheritance.interfaces.JuniorActions;
import inheritance.interfaces.SeniorActions;

public abstract class Employee extends AnnualOperations implements JuniorActions, SeniorActions {

    private String name;
    private double salary;
    private String startDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //Todo add validation
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        //Todo add validation
        this.salary = salary;
    }

    public String getStartDate() {
        return startDate;
    }

    private void setStartDate(String startDate) {
        //Todo add validation
        this.startDate = startDate;
    }

    public Employee(String name, String startDate, double salary){
        setName(name);
        setStartDate(startDate);
        setSalary(salary);
    }

//    @Override
//    public void calculateAnnualBonus(boolean isTargetAchieved) {
//        System.out.println("Bonus cannot be calculated");
//    }
}
