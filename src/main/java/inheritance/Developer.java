package inheritance;

public class Developer extends Employee{
    private String programingLanguage;

    public String getProgramingLanguage() {
        return programingLanguage;
    }

    public void setProgramingLanguage(String programingLanguage) {
        //todo validation
        this.programingLanguage = programingLanguage;
    }

    public Developer(String name, String startDate, String programingLanguage, double salary){
        super(name, startDate, salary);
        setProgramingLanguage(programingLanguage);
    }

    @Override
    public void calculateAnnualBonus(boolean isTargetAchieved) {
        if (isTargetAchieved){
            System.out.println("You have bonus of 500");
        }else {
            System.out.println("You have to perform better");
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
