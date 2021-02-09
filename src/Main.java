import cat.Cat;
import cat.Lion;
import box.Box;
import box.BoxWeight;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(10, 15, 20);
        box.showInfo();

        BoxWeight box2 = new BoxWeight(box, 20);
        box2.showInfo();

    }
}
