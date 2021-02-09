package cat;

public class CatFamily {
    private int ears;
    private int legs;
    private boolean bigClaws;



    public CatFamily(int ears, int legs, boolean bigClaws) {
        this.ears = ears;
        this.legs = legs;
        this.bigClaws = bigClaws;
    }

    public void setBigClaws(boolean bigClaws) {
        this.bigClaws = bigClaws;
    }

    public void showInfo() {
        System.out.println("Number of ears: " + ears + "\nNumber of legs: " + legs + "\nBig claws: " + bigClaws);
    }

    public void eat() {
        System.out.println("I'm eating");
    }

}
