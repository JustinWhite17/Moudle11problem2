
package NewDrawingSys;

import com.mycompany.oldDrawingSys.Circle;
import com.mycompany.oldDrawingSys.Rectangle;

public class ModifiedSystem {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        Shape circleAdapter = new CircleAdapter(circle);
        Shape rectangleAdapter = new RectangleAdapter(rectangle);

        Shape[] shapes = {circleAdapter, rectangleAdapter};

        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;

        for (Shape shape : shapes) {
            shape.draw(x1, y1, x2, y2);
        }
    }
}

