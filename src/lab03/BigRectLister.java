package lab03;

import java.awt.Rectangle;
import java.util.ArrayList;

public class BigRectLister {

    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        Filter filter = new BigRectangleFilter();

        rectangles.add(new Rectangle(1, 1));
        rectangles.add(new Rectangle(2, 2));
        rectangles.add(new Rectangle(3, 3));
        rectangles.add(new Rectangle(1, 2));
        rectangles.add(new Rectangle(2, 3));
        rectangles.add(new Rectangle(4, 4));
        rectangles.add(new Rectangle(5, 5));
        rectangles.add(new Rectangle(6, 1));
        rectangles.add(new Rectangle(2, 6));
        rectangles.add(new Rectangle(10, 1));

        for (Rectangle r : rectangles) {
            if (filter.accept(r)) {
                int perimeter = 2 * (r.width + r.height);
                System.out.println(
                        "Rectangle width=" + r.width +
                                " height=" + r.height +
                                " perimeter=" + perimeter
                );
            }
        }
    }
}
