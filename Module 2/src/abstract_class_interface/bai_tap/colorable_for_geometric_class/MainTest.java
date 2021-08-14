package abstract_class_interface.bai_tap.colorable_for_geometric_class;

public class MainTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(3.5);
        shapes[1] = new Rectangle(4.5,6.5);

        System.out.println("Pre:");
        for (Shape shape:shapes){
            System.out.println(shape.toString());
        }

        System.out.println("After:");
        for (Shape shape:shapes){
            shape.howToColor();
        }
    }
}
