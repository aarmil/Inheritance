import cat.Cat;
import cat.Lion;
import box.Box;
import box.BoxWeight;
import figures.Figure;
import figures.Rect;
import figures.Triangle;

public class Main {
    public static void main(String[] args) {
        Rect rect = new Rect(3,2);
        double a = rect.area();
        System.out.println(a);

        Triangle tr = new Triangle(3,2,4);
        double b = tr.area();
        System.out.println(b);

    }
}
