package inheritance;

public class QualityAssurance extends Employee{
    private boolean isAutomation;

    public boolean isAutomation() {
        return isAutomation;
    }

    public QualityAssurance(String name, String startDate, double salary, boolean isAutomation){
        super(name, startDate, salary);
        this.isAutomation = isAutomation;
    }

    @Override
    public void calculateAnnualBonus(boolean isTargetAchieved) {
        if (isTargetAchieved){
            System.out.println("You have a bonus of 2000");
        }else {
            System.out.println("You have a bonus of 1000");
        }
    }

    @Override
    public void askQuestions() {

    }

    @Override
    public void takeTrainings() {

    }

    @Override
    public void planTrainings() {

    }

    @Override
    public void giveHelp() {

    }

    @Override
    public void giveFeedback() {

    }
}
