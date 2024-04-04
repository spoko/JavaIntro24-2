package inheritance;

public abstract class AnnualOperations {
    public void receivePositiveFeedback(){
        System.out.println("You did great job!");
    }

    public void receiveNegativeFeedback(){
        System.out.println("You shall perform better this year!");
    }

    public abstract void calculateAnnualBonus(boolean isTargetAchieved);
}
