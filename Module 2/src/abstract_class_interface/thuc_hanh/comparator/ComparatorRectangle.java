package abstract_class_interface.thuc_hanh.comparator;

import abstract_class_interface.thuc_hanh.geometry.Rectangle;

import java.util.Comparator;

public class ComparatorRectangle implements Comparator<Rectangle> {

    @Override
    public int compare(Rectangle o1, Rectangle o2) {
        if (o1.getArea() > o2.getArea()){
            return 1;
        } else if (o1.getArea() < o2.getArea()){
            return -1;
        } else {
            return -1;
        }
    }
}
